package ua.lviv.iot.firstLab;

public class PetLeash {

	private static int Serial_number;

	private String manufacturer;
	private double max_Length_In_Metres;
	private double max_Weight_In_Kilos;
	private String color;

	private String material;
	private String type;

	protected int price_in_UAH;
	protected String country_manufacturer;

	public PetLeash(String manufacturer, double max_Length_In_Metres, double max_Weight_In_Kilos, String color, 
	        String material, String type, int price_in_UAH, String country_manufacturer) {

this.manufacturer = manufacturer;
this.max_Length_In_Metres = max_Length_In_Metres;
this.max_Weight_In_Kilos = max_Weight_In_Kilos;
this.color = color;
this.material = material;
this.type = type;
this.price_in_UAH = price_in_UAH;
this.country_manufacturer = country_manufacturer;
}

	public PetLeash(String manufacturer, double max_Length_In_Metres, double max_Weight_In_Kilos, String color) {
		this(manufacturer, max_Length_In_Metres, max_Weight_In_Kilos, color, null, null, 0 ,null);
	}

	

	public PetLeash() {
		
	}
	public static int getSerial_number() {
		return Serial_number;
	}

	public static void setSerial_number(int serial_number) {
		PetLeash.Serial_number = serial_number;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getMax_Length_In_Metres() {
		return max_Length_In_Metres;
	}

	public void setMaxLengthInMetres(double max_Length_In_Metres) {
		this.max_Length_In_Metres = max_Length_In_Metres;
	}

	public double getMax_Weight_In_Kilos() {
		return max_Weight_In_Kilos;
	}

	public void setMax_Weight_In_Kilos(double max_Weight_In_Kilos) {
		this.max_Weight_In_Kilos = max_Weight_In_Kilos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice_in_UAH() {
		return price_in_UAH;
	}

	public void setPrice_in_UAH(int price_in_UAH) {
		this.price_in_UAH = price_in_UAH;
	}

	public String getCountry_manufacturer() {
		return country_manufacturer;
	}

	public void setCountry_manufacturer(String country_manufacturer) {
		this.country_manufacturer = country_manufacturer;
	}
	
	public void resetValues(String manufacturer, double max_Length_In_Metres, double max_Weight_In_Kilos, String color,
			                String material, String type, int price_in_UAH, String country_manufacturer) {
		
		this.manufacturer = manufacturer;
		this.max_Length_In_Metres = max_Length_In_Metres;
		this.max_Weight_In_Kilos = max_Weight_In_Kilos;
		this.color = color;
		this.material = material;
		this.type = type;
		this.price_in_UAH = price_in_UAH;
		this.country_manufacturer = country_manufacturer;
	}
	
	

    
	public String toString() {
		return  "manufacturer: " + manufacturer + "\n" +
                "maximum Length: " + max_Length_In_Metres + "Meters" + "\n" +
                "maximum Weight: "  + max_Weight_In_Kilos + "Kilos" +"\"\n" +
                "color: " + color +  "\n" +
                "material: " + material  + "\n" +
                "type: " + type + "\n" +
                "price: " + price_in_UAH + "UAH" + "\n" +
				"country manufacturer: " + country_manufacturer + "\n";
	}

	public static char[] printStaticSerial_number() {
		// TODO Auto-generated method stub
		return null;
	}

	public static char[] printSerial_number() {
		// TODO Auto-generated method stub
		return null;
	}


		
	}	
