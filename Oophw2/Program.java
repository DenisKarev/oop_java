
import java.util.ArrayList;

public class Program {

  public static void main(String[] args) {

    Person node1 = new Person("Вито", "Корлеоне", "Godfather", "1882 - 1954", "Муж");
    Person node2 = new Person("Кармелла", "Корлеоне", "1897-1959", "Жен");

    Person node3 = new Person("Констанция", "Корлеоне", "Конни", "1927 - ?", "Жен");
    Person node4 = new Person("Фредерико", "Корлеоне", "Фредо", "1919 - 1959", "Муж");
    Person node5 = new Person("Сантино", "Корлеоне", "Сонни", "1916 - 1948", "Муж");
    Person node6 = new Person("Майкл", "Корлеоне", "1920 - 1997", "Муж");

    GeoTree gt = new GeoTree();
    gt.append(node1, node2);
    gt.append(node1, node3);
    gt.append(node2, node4);
    gt.append(node2, node5);

    System.out.println(new Research(gt).spend(node1, Relations.CHILD));
  }
}

class Node {

  public Node(Person p1, Person p2, Relations re) {
    this.p1 = p1;
    this.re = re;
    this.p2 = p2;
  }

  Person p1;
  Person p2;
  Relations re;

  @Override
  public String toString() {
    return String.format("<%s %s %s>", p1, re, p2);
  }
}

interface Tree {
  void append(Person parent, Person children);

  ArrayList<Node> getData();
}

class GeoTree implements Tree {
  private ArrayList<Node> tree = new ArrayList<>();

  public ArrayList<Node> getData() {
    return tree;
  }

  public void append(Person parent, Person child) {

    tree.add(new Node(parent, child, Relations.PARENT));
    tree.add(new Node(child, parent, Relations.CHILD));
  }
}

interface IResearch {
  ArrayList<Person> spend(Person p, Relations re);
}

class Research implements IResearch {
  ArrayList<Node> tree;

  public Research(Tree pd) {
    tree = pd.getData();
  }

  @Override
  public ArrayList<Person> spend(Person p, Relations re) {
    var result = new ArrayList<Person>();
    for (Node t : tree) {
      if (t.p1.sName() == p.sName()
          && t.re == re) {
        result.add(t.p2);
      }
    }
    return result;
  }
}
