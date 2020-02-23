package ua.lviv.iot.firstLab;

public class PethLeashMaker {

		public static void main(String[] args) {
			PetLeash first = new PetLeash();
			PetLeash second = new PetLeash("Cat Paradise", 20, 10, "green");
			PetLeash third = new PetLeash("Dog world", 30, 25, "red", "nylon", "for dog", 365, "China");
			
			  System.out.println("____________one____________");
		        System.out.println(first.toString());
		    System.out.println("____________two____________");
		        System.out.println(second.toString());
		    System.out.println("____________three____________");
		        System.out.println(third.toString());
		
		   
		        System.out.println();
		        System.out.println(second.printStaticSerial_number());
		        System.out.println(PetLeash.printSerial_number());
		
		
		        int size = 4;
		        PetLeash arrayOfPetLeash[] = new PetLeash[size];
		        for (int i = 0; i<size;i++)
		        {
		            arrayOfPetLeash[i]= new PetLeash();
		        }

		        System.out.println();
		        for (PetLeash iterator : arrayOfPetLeash){
		            System.out.println(iterator.toString());
		            System.out.println();
		        }


		        }
		}
