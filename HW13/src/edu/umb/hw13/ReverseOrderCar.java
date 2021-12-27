
Carlist.sort((car c1, car c2)->c2.getName().compareTo(c1.getName()));


//Lambda expression for sorting the list by car price in reverse order 
carlist.sort((car c1, car c2)->c2.getPrice()-c1.getPrice());
//Lambda expression for sorting the list by car model in reverse order 
carlist.sort((car c1, car c2)->c2.getModel()-c1.getModel());
