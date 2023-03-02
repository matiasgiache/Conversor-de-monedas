import javax.swing.JOptionPane;

public class Main{
	
	public static void main(String[] args) {
		Object[] conversorTipo = { "Conversor de Moneda", "Conversor de Temperatura"};
		Object seleccionConversor = JOptionPane.showInputDialog(null,
		"Seleccione una opcion de conversion: ", "Conversion",
		-1, null,
		conversorTipo, conversorTipo[0]);
		
		if(seleccionConversor == "Conversor de Moneda") {
			String msg = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:","Dinero",-1);
			double dinero = Double.parseDouble(msg);
			Object[] monedaCambio = {"De peso a Dolar", "De peso a Euros", "De peso a Libras Esterlinas", "De peso a Yen Japones"
					,"De peso a Won Sur-coreano","De Dolar a Peso","De Euro a Peso","De Libras Esterlinas a Peso","De Yen Japones a Peso",
					"De Won Sur-coreano a Peso"};
			Object cambioSelec = JOptionPane.showInputDialog(null, "Ingrese la moneda a la que desea convertir su dinero",
					"Moneda", -1, null, monedaCambio, monedaCambio[0]);
			switch (cambioSelec.toString()) {
			case "De peso a Dolar":
				double dineroEnDolar = Math.round((dinero*0.0051)*100d)/100d;
				JOptionPane.showMessageDialog(null, "Tienes: $" + dineroEnDolar + " dolares.");
				break;
			case "De peso a Euros":
				double dineroEnEuro = Math.round((dinero*0.0047)*100d)/100d;
				JOptionPane.showMessageDialog(null, "Tienes: $" + dineroEnEuro + " euros.");
				break;
			case "De peso a Libras Esterlinas":
				double dineroEnLibras = Math.round((dinero*0.0042)*100d)/100d;
				JOptionPane.showMessageDialog(null, "Tienes: $" + dineroEnLibras + " libras esterlinas.");
				break;
			case "De peso a Yen Japones":
				double dineroEnYen = Math.round((dinero*0.69)*100d)/100d;
				JOptionPane.showMessageDialog(null, "Tienes: $" + dineroEnYen + " yen japoneses.");
				break;
			case "De peso a Won Sur-coreano":
				double dineroEnWon = Math.round((dinero*6.59)*100d)/100d;
				JOptionPane.showMessageDialog(null, "Tienes: $" + dineroEnWon + " won surcoreanos.");
				break;
			case "De Dolar a Peso":
				double dolarAPeso = Math.round((dinero*197.59)*100d)/100d;
				JOptionPane.showMessageDialog(null, "Tienes: $" + dolarAPeso + " pesos.");
				break;
			case "De Euro a Peso":
				double euroAPeso = Math.round((dinero*210.37)*100d)/100d;
				JOptionPane.showMessageDialog(null, "Tienes: $" + euroAPeso + " pesos.");
				break;
			case "De Libras Esterlinas a Peso":
				double librasAPeso = Math.round((dinero*237.06)*100d)/100d;
				JOptionPane.showMessageDialog(null, "Tienes: $" + librasAPeso + " pesos.");
				break;
			case "De Yen Japones a Peso":
				double yenAPeso = Math.round((dinero*1.45)*100d)/100d;
				JOptionPane.showMessageDialog(null, "Tienes: $" + yenAPeso + " pesos.");
				break;
			case "De Won Sur-coreano a Peso":
				double wonAPeso = Math.round((dinero*0.15)*100d)/100d;
				JOptionPane.showMessageDialog(null, "Tienes: $" + wonAPeso + " pesos.");
				break;
			}
			
		}else if (seleccionConversor == "Conversor de Temperatura") {
			String msgTemp = JOptionPane.showInputDialog(null, "Ingrese la temperatura a convertir","Temperatura",-1);
			double temperatura = Double.parseDouble(msgTemp);
			Object[] tempCambio = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius","De Fahrenheit a Kelvin",
						"De Kelvin a Celsius", "De Kelvin a Fahrenheit"};
			Object tempSelec = JOptionPane.showInputDialog(null, "Ingrese la escala a la que desea convertir la temperatura:",
						"Escala", -1, null, tempCambio, tempCambio[0]);
			switch (tempSelec.toString()) {
			case "De Celsius a Fahrenheit":
				double celsiusFahren = Math.round(((temperatura*1.8)+32)*100d)/100d;
				JOptionPane.showMessageDialog(null, temperatura + " grados Celsius son "+ celsiusFahren + " grados Fahrenheit.");
				break;
			case "De Celsius a Kelvin":
				double celsiusKelvin = Math.round((temperatura+273.15)*100d)/100d;
				JOptionPane.showMessageDialog(null, temperatura + " grados Celsius son "+ celsiusKelvin + " grados Kelvin.");
				break;
			case "De Fahrenheit a Celsius":
				double fahrenCel = Math.round(((temperatura-32)/1.8)*100d)/100d;
				JOptionPane.showMessageDialog(null, temperatura + " grados Fahrenheit son "+ fahrenCel + " grados Celsius.");
				break;
			case "De Fahrenheit a Kelvin":
				double fahrenKel = Math.round(((5/9)*(temperatura-32)+273.15)*100d)/100d;
				JOptionPane.showMessageDialog(null, temperatura + " grados Fahrenheit son "+ fahrenKel + " grados Kelvin.");
				break;
			case "De Kelvin a Celsius":
				double kelvinCel = Math.round((temperatura-273.15)*100d)/100d;
				JOptionPane.showMessageDialog(null, temperatura + " grados Kelvin son "+ kelvinCel + " grados Celsius.");
				break;
			case "De Kelvin a Fahrenheit":
				double kelvinFahren = Math.round((1.8*(temperatura-273.15)+32)*100d)/100d;
				JOptionPane.showMessageDialog(null, temperatura + " grados Kelvin son "+ kelvinFahren + " grados Fahrenheit.");
				break;
			}
		}
			
		}
}
