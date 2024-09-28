CSG simpleSyntax =new Cylinder(28/2,7).toCSG() // a one line Cylinder
CSG hardSyntax =new Cylinder(22.15/2,7).toCSG()

CSG mediumSyntax =simpleSyntax.movey(40)
CSG modeSyntax =hardSyntax.movey(40)

CSG hugeSyntax =new Cube(22,40,5).toCSG()
					.toZMin()
					.toYMin()

CSG printedSyntax = simpleSyntax.union(hugeSyntax)
							.union(mediumSyntax)
printedSyntax = printedSyntax.difference(hardSyntax)
							.difference(modeSyntax)

return [printedSyntax]
