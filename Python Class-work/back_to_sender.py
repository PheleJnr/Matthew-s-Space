successful_delivery = int(input("Enter the number of successful delivery: "))

base_pay = 5000

if (successful_delivery >= 70):
    print("the wage of the rider for the day: ", + successful_delivery * 500 + base_pay)
        
elif (successful_delivery >= 60 and successful_delivery <= 69):
    print("the wage of the rider for the day: ", + successful_delivery * 250 + base_pay)

elif (successful_delivery >= 50 and successful_delivery <= 59):
    print("the wage of the rider for the day: ", + successful_delivery * 200 + base_pay)

else:
    print("the wage of the rider for the day: ", + successful_delivery * 160 + base_pay)

