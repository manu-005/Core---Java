public class JaiRamMedicalsrunner {
    
    public static void main(String q[])
    {

        JaiRamMedicals medical1=new JaiRamMedicals("JaiRam medicals",11);
        System.out.println("Medical  Name"+ medical1.name +"Medical Id:"+medical1.mId);

        JaiRamMedicals medical2=new JaiRamMedicals("bharath",true);
        System.out.println("Owner :"+medical2.owner);
        System.out.println("Is open :"+medical2.isOpen);

        JaiRamMedicals medical3=new JaiRamMedicals();

        JaiRamMedicals medical4=new JaiRamMedicals();

        

    }
}
