def collatz_conjecture(n):
    print(int(n))

    if n == 1:
        return

    return collatz_conjecture(3 * n + 1) if n % 2 else collatz_conjecture(n / 2)


collatz_conjecture(37)
