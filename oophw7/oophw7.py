from interfaces.controller import controller
from interfaces.consoleview import consoleview
from databases.phdatabase import phdatabase

db = phdatabase()
v = consoleview()

contr = controller(v, db)

contr.run()