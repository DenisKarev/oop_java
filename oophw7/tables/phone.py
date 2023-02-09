from abc import ABC, abstractmethod
from models.modelshow import modelshow


class phone(modelshow):
    persid: int
    phone: str
    commentary: str

    def __init__(phon, phone, comm) -> None: # id, 
        # phon.persid = id
        phon.phone = phone
        phon.commentary = comm

    def show(phon):
        return (f"{phon.phone} {phon.commentary}")
