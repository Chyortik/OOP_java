from tkinter import Tk
import calculated


class App:
    def __init__(self, master):
        self.master = master
        calculated.Calculator(self.master, 0, 0)


root = Tk()
App(root)
root.title('My calculator')
root.mainloop()