from abc import ABC, abstractmethod


class viewmodel(ABC):

    # @classmethod  # ?????
    @abstractmethod
    def menu0(self):
        pass

    @abstractmethod
    def menu0(self):
        pass

    @abstractmethod
    def menuSearch(self):
        pass

    @abstractmethod
    def mDeletePerson(self):
        pass

    @abstractmethod
    def mAddPerson(self):
        pass

    @abstractmethod
    def mAddPhoneToPerson(self):
        pass

    @abstractmethod
    def textout(self, text: str):
        pass
