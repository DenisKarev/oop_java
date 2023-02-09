from databases.database_hw7 import database
from tables.person import person
from tables.phone import phone
from databases.dbfile import dbfile


class phdatabase():
    data: database

    def __init__(self) -> None:
        self.lastid = 0
        self.data = database()
        self.readdb()

    def readdb(self):
        with open(dbfile, "r", encoding="UTF-8") as fr:
            fr.readline()
            read = [line.strip().split(";") for line in fr]
            for i in read:
                per = person(i[0], i[1], i[2], i[3], i[4])
                per.addphone(phone(i[5], i[6]))
                self.data.addtodb(per)


    def writedb(self):
        pass

    def getPersonById(self, id) -> person:
        return self.data.getfromdb(id)
        # return self.data.base[id]

    def getsize(self):
        return self.data.getsize()

    def writepersontodb(self):
        pass
