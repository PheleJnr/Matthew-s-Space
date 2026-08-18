def calculate_wage(successful_delivery):
    base_pay = 5000

    if successful_delivery >= 70:
        wage = successful_delivery * 500 + base_pay

    elif successful_delivery >= 60 and successful_delivery <= 69:
        wage = successful_delivery * 250 + base_pay

    elif successful_delivery >= 50 and successful_delivery <= 59:
        wage = successful_delivery * 200 + base_pay

    else:
        wage = successful_delivery * 160 + base_pay

    return wage


successful_delivery = int(input("Enter the number of successful delivery: "))

wage = calculate_wage(successful_delivery)

print("the wage of the rider for the day: ", wage)



