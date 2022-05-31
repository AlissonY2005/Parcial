from math import sqrt

if __name__ == '__main__':
	print "Ingrese los valores de A, B, C"
	a = float(raw_input())
	b = float(raw_input())
	c = float(raw_input())
	disc = b**2-(4*a*c)
	if disc==0:
		x = -b/(2*a)
		print "Es u trinomio cuadrado perfecto y X=",x
	else:
		if disc>0:
			x1 = (-b-sqrt(disc))/(2*a)
			x2 = (-b+sqrt(disc))/(2*a)
			print "Tiene dos soluciones reales, X1=",x1,"y X2=",x2
		else:
			k = (-b)/(2*a)
			z = (sqrt(abs(disc)))/(2*a)
			print "Tiene dos soluciones complejas X1=",k,"+",z,"i y X2=",k,"-",z,"i"

