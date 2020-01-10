package Code;
class ClientBO

{

 

  void viewDetails(Client[] clientList)

  {

     //fill your code;

     int n=clientList.length;

     for(int i=0;i<n;i++)

     {

         System.out.print(clientList[i]);

}
     }

  void printClientDetailsWithCountry(Client[] clientList, String countryName)

  {

    //fill your code;

    int n=clientList.length;

     for(int i=0;i<n;i++)

     {

         if(clientList[i].getCountry().getCountryName().equals(countryName))

         {

         System.out.print(clientList[i]);

         }
     }

  }
}