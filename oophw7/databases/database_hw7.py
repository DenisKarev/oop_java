from tables.person import person


class database():       # type
    lastid: int
    base = list         # type? : person

    def __init__(db) -> None:
        db.lastdid = 0
        db.base = list()

    def addtodb(self, p: person):
        self.base.append(p)
        pass

    def getfromdb(self, id)  -> person:
        return self.base[id]

    def getsize(self):
        return len(self.base)

    def getlastid(self):
        pass
