from abc import ABC, abstractmethod
from models.modelshow import modelshow
from tables.phone import phone
# from types import Any


class person(modelshow):
    id: int
    firstname: str
    secondname: str
    birthdate: str
    commentary: str

    def __init__(pers, id, fname, secname, bdate, comm) -> None:
        pers.id = id
        pers.firstname = fname
        pers.secondname = secname
        pers.birthdate = bdate
        pers.commentary = comm
        pers.phones = list()

    def addphone(pers, ph: phone):
        pers.phones.append(ph)

    def show(pers):
        for i in pers.phones:
            return (f"{pers.id}. {pers.firstname} {pers.secondname} [{pers.birthdate}] ({pers.commentary}) {i.show()}")
