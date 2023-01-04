var circulo, triangulo,rectangulo,op="4",cuadrado;
let base="5" , altura="2";
console.log("1.circulo");
console.log("2.triangulo");
console.log("3.rectangulo");
 op;
switch (op)
{
 case "1":
    let radio ="4";
    console.log("ingrese el radio del circulo");
    radio;
    circulo = 3.1416*radio;
    console.log("area es de ",circulo)
    break;
    case "2":
        let base="5" , altura="2";
        console.log("ingrese el base del triangulo");
        base;
        console.log("ingrese la altura del triangulo");
        altura;
        triangulo = (base* altura)/2;
        console.log("la area es:", triangulo);
        break;
    case "3":
        console.log("ingrese la base");
        base;
        console.log("ingrese altura");
        altura;
        rectangulo = base*altura;
        console.log("la area es ",rectangulo);
        break;
    case "4":
        let lado="6";
        console.log("ingrese lado");
        lado;
        cuadrado= lado *lado;
        console.log("el area es de  ",cuadrado);
        break;

}

