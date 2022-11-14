def coin_goes_into(coin, price):
    total = 0
    while price >= coin:
        price -= coin
        total +=1
    return price, total

def solution(coins, price):
    total_amount_of_coins = 0
    for coin in coins[::-1]:
        price, total = coin_goes_into(coin, price)
        total_amount_of_coins += total

    return total_amount_of_coins
    