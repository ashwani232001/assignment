class Inheritance_Activity4  {
     public static void main(String[] args) {
         Manager m =new Manager(126534,"Peter","Chennai,India",237844,65000);
         Trainee t =new Trainee(39846,"Jack","Mumbai, India",442085,45000);

         m.calculateSalary();
         m.calculateTransportAllowance();

         t.calculateSalary();
         t.calculateTransportAllowance();
     }
}
