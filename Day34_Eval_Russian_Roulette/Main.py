import sys
import random
# Day 34:
# A program which makes use of eval and exec to execute random pieces of code, one of which being sys.exit()
# This is possibly the stupidest piece of code I have ever written, but I didn't realise just how powerful
# eval and exec.

# I don't need to write anymore programs now if I can just get a computer to do it for me. Who need GitHub Copilot when
# you have this?

actions = ["print('hello')", "print(n)", "exec('n = random.randint(0,100)')", "exec('n += 1')", "sys.exit()",
           "print(divmod(n, 7))", "print_loop(n)", """exec("actions.append('''print('Thats a nice Potato')''')")"""]


def print_loop(n):
    for i in range(n):
        print("🦒")


if __name__ == '__main__':
    n = 0
    while True:
        action_to_perform = actions[random.randint(0, len(actions) - 1)]
        print("\n" + action_to_perform)
        eval(action_to_perform)
