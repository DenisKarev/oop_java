from interfaces.menus_hw7 import menus
from interfaces.view_hw7 import viewhw7


class consoleview(viewhw7):
    m = menus()

    def menu0(conv):
        print(conv.m.menuMain)

    def menuSearch(conv):
        print(conv.m.menuSearch)
    
    def mAddPhoneToPerson(conv):
         print(conv.m.menuAddPhone)

    def mDeletePerson(conv):
        print(conv.m.menuDelete)

    def mAddPerson(conv):
        print(conv.m.menuAdd)

    def textout(conv, text: str):
        print(text)
