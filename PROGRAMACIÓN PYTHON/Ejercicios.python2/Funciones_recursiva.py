

def factorial_recursivo(n):
    if n == 0  or n == 1:
        return 1
    else:
        return n * factorial_recursivo(n-1)

print(factorial_recursivo(7))