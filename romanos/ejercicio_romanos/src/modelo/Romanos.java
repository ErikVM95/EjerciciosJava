package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Romanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> romanos=new ArrayList<>();
		romanos.add("I");romanos.add("V");romanos.add("X");
		romanos.add("L");romanos.add("C");romanos.add("D");
		romanos.add("M");
		
		ArrayList<Integer> numeros=new ArrayList<>();
		numeros.add(1);numeros.add(5);numeros.add(10);
		numeros.add(50);numeros.add(100);numeros.add(500);
		numeros.add(1000);
		
		int num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero de 1 a 1000"));
		
		String cad="", b1="", b2="", res="nada";
		int con=0;
		
		//for(int a=0; a<3 ;a++){//M
			for(int b=0; b<3 ;b++){//D
				if(b!=1){
					for(int c=0; c<=3; c++){//C
						if(c>0){
							b2+="C";
							b1="";
							cad="";
							con++;if(con==num){res=b2+b1+cad;}
							System.out.println(b2+b1+cad);
						}
						for(int d=0; d<3; d++){//L
							if(d!=1){
								for(int e=0; e<=3; e++){//X
									if(e>0){
										b1+="X";con++;
										cad="";
										if(con==num){res=b2+b1+cad;}
										System.out.println(b2+b1+cad);
										System.out.println(con);
									}
									for(int f=0; f<2; f++){//V
										if (f>0){cad="V";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="";}
										for(int g=0; g<3; g++){//I
											cad+="I";con++;if(con==num){res=b2+b1+cad;}
											System.out.println(b2+b1+cad);
										}
										if (f==0){cad="IV";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else if (f==1){cad="IX";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
									}
								}
							}else{
								for(int f=0; f<2; f++){//V
									if (f>0){cad="V";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="";}
									for(int g=0; g<3; g++){//I
										cad+="I";con++;if(con==num){res=b2+b1+cad;}
										System.out.println(b2+b1+cad);
									}
									if (f==0){cad="IV";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="IX";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
								}
							}
							if (d==0){b1="XL";cad="";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}if (d==1){b1="L";cad="";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else if(d==2){b1="XC";cad="";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
						}
						
						for(int f=0; f<2; f++){//V
							if (f>0){cad="V";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="";}
							for(int g=0; g<3; g++){//I
								cad+="I";con++;if(con==num){res=b2+b1+cad;}
								System.out.println(b2+b1+cad);
							}
							if (f==0){cad="IV";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="IX";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
						}
					}
				}
				else{
					for(int d=0; d<3; d++){//L
						if(d!=1){
							for(int e=0; e<=3; e++){//X
								if(e>0){
									b1+="X";
									cad="";
									con++;if(con==num){res=b2+b1+cad;}
									System.out.println(b2+b1+cad);
								}
								for(int f=0; f<2; f++){//V
									if (f>0){cad="V";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="";}
									for(int g=0; g<3; g++){//I
										cad+="I";con++;if(con==num){res=b2+b1+cad;}
										System.out.println(b2+b1+cad);
									}
									if (f==0){cad="IV";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="IX";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
								}
							}
						}else{
							for(int f=0; f<2; f++){//V
								if (f>0){cad="V";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="";}
								for(int g=0; g<3; g++){//I
									cad+="I";con++;if(con==num){res=b2+b1+cad;}
									System.out.println(b2+b1+cad);
								}
								if (f==0){cad="IV";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="IX";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
							}
						}
						if (d==0){b1="XL";cad="";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}if (d==1){b1="L";cad="";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else if(d==2){b1="XC";cad="";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
					}
					for(int f=0; f<2; f++){//V
						if (f>0){cad="V";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="";}
						for(int g=0; g<3; g++){//I
							cad+="I";con++;if(con==num){res=b2+b1+cad;}
							System.out.println(b2+b1+cad);
						}
						if (f==0){cad="IV";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="IX";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
					}
				}
				if (b==0){b2="CD";b1="";cad="";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}if (b==1){b2="D";b1="";cad="";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else if(b==2){b2="CM";b1="";cad="";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
			}
			for(int d=0; d<3; d++){//L
				if(d!=1){
					for(int e=0; e<=3; e++){//X
						if(e>0){
							b1+="X";
							cad="";
							con++;if(con==num){res=b2+b1+cad;}
							System.out.println(b2+b1+cad);
						}
						for(int f=0; f<2; f++){//V
							if (f>0){cad="V";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="";}
							for(int g=0; g<3; g++){//I
								cad+="I";con++;if(con==num){res=b2+b1+cad;}
								System.out.println(b2+b1+cad);
							}
							if (f==0){cad="IV";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="IX";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
						}
					}
				}else{
					for(int f=0; f<2; f++){//V
						if (f>0){cad="V";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="";}
						for(int g=0; g<3; g++){//I
							cad+="I";con++;if(con==num){res=b2+b1+cad;}
							System.out.println(b2+b1+cad);
						}
						if (f==0){cad="IV";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="IX";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
					}
				}
				if (d==0){b1="XL";cad="";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}if (d==1){b1="L";cad="";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else if(d==2){b1="XC";cad="";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
			}
			for(int f=0; f<2; f++){//V
				if (f>0){cad="V";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="";}
				for(int g=0; g<3; g++){//I
					cad+="I";con++;if(con==num){res=b2+b1+cad;}
					System.out.println(b2+b1+cad);
				}
				if (f==0){cad="IV";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}else{cad="IX";con++;if(con==num){res=b2+b1+cad;}System.out.println(b2+b1+cad);}
			}
		
			b1="";b2="";cad="M";
			con++;if(con==num){res=b2+b1+cad;}
			System.out.println(cad);
			JOptionPane.showMessageDialog(null, "Resultado: "+res);
	}

}
