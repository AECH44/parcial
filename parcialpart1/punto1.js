function sumarCuadros(arrayNumeros) {
    arrayNumeros.sort((a, b) => a - b);

    let grafica = "";
    for (let i = 0; i < arrayNumeros.length; i++) {
        const numero = arrayNumeros[i];
        const espacio = "+" + "-".repeat(String(numero).length)+ "+";
        grafica += `|${numero}|\n${espacio}\n`;
    }
    const total = arrayNumeros.reduce((num1, num2) => num1 + num2, 0);
    const espacioTotal = "+"+"=".repeat(String(total).length)+"+";
    grafica += `|${total}|\n${espacioTotal}\n`;
    console.log(grafica);
}
const arrayNumeros = [1, 23, 453, 3267, 12354, 123456];
sumarCuadros(arrayNumeros);