from interfaces.consoleview import consoleview
from databases.phdatabase import phdatabase
from interfaces.consoleinput import coninput
from tables.person import person

class controller():
    v: consoleview
    db : phdatabase
    inp : coninput

    def __init__(contr, v, db) -> None:
        contr.v = v
        contr.db = db
        contr.inp = coninput()

    def run(contr):
        stop = False
        contr.v.menu0()
        while(not stop):
            ch = contr.inp.consinput()
            if(ch.isdigit()):
                ch = int(ch)
                if (ch == 1):
                    contr.showall()
                    contr.v.textout("   press enter to show Menu")
                    contr.inp.consinput()
                    contr.v.menu0()

                elif (ch == 2):
                    pass
                elif (ch == 3):
                    pass
                elif (ch == 4):
                    pass
                elif (ch == 5):
                    pass
                elif (ch == 0):
                    stop = True
            else:
                contr.v.textout("Incorrect input! Try again!")
            # print(ch)
        pass

    def showall(contr):     # Правда догдываюсь что тут этому методу не место %)))
        # pp : person
        for i in range(contr.db.getsize()):
            pp = contr.db.getPersonById(i)
            print(pp.show())