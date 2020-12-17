# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

costat_curt = int(input("Donam el costat curt"))
caracter = input("Donam el caracter")

for i in range(costat_curt):
    for j in range(costat_curt*2):
        if i==0 or i==costat_curt-1 or j==0 or j==(costat_curt*2)-1:
            print(caracter, end='')
        else:
            print(" ", end='')
    print("\n")
