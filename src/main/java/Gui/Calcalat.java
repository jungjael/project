package Gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calcalat  implements ActionListener {
	private String first="";  		
	private String result="";
	private String re="";
	private boolean start;
	JTextField textfieldNorth = new JTextField("");
	JTextField textField = new JTextField("");
	ArrayList<Integer> ee = new ArrayList<Integer>();  
	ArrayList<String> store = new ArrayList<String>();
	Calcalat ( JTextField textfieldNorth , JTextField textField ){
		this.textfieldNorth = textfieldNorth;
		this.textField = textField;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str=e.getActionCommand();  		
		String read;
		
		try{	
			//연산기호가 아닌 숫자이면 true 이다.
			if(str!="/" && str!= "*"&& str!= "-"&& str!= "+"&& str!= "C"&& str!= "="){	
				textField.getText();  			
				textfieldNorth.getText();			
				read=textField.getText();
				
				first=read+str;
				textField.setText(first);	
				
				textField.getText(); 			
			}			
			
			if(str.equals("/") || str.equals("*") || str.equals("-") || str.equals("+")){
				read=textField.getText();
				first+=read+str;
				ee.add(Integer.parseInt(read));
				textfieldNorth.setText(first);
				textField.setText("");
				
				

				store.add(str); 			 
			}

			if(str=="="){
				
				int sum = 0;
				sum=ee.get(0); 		
				
				for(int a=0,h= 1; a<ee.size(); a++,h++){
					
					int ve=store.size(); 				
					if(ve>0){							
						ve--;			
						
						if(store.get(a)=="+"){			
							sum=sum+ee.get(h);
							
						}else if(store.get(a)=="-"){		
							sum=sum-ee.get(h);	
							
						}else if(store.get(a)=="*"){
							sum=sum*ee.get(h);
							
						}else if(store.get(a)=="/"){
							try{				
								sum=sum/ee.get(h);
								
							}catch(Exception exc){		
								sum=0; 
							
							}
						}			
					}
				}
				result=sum+"";						
				textfieldNorth.setText(result);  		
				textField.getText(); 		
				
			}
			
			
			if(str=="C"){
				first="";
				textField.setText(""); 			 
				textField.getText();  			
				textfieldNorth.setText(""); 	
				textfieldNorth.getText(); 
				ee.clear();  					
				store.clear();  				
			}
			
		}catch(Exception ex){
			textField.setText("Error");  
			textField.getText(); 
		}

		
	}
	
	//	System.out.println("222222");

}




