const brain = require('brain.js')

const network = new brain.NeuralNetwork();


network.train([
    { input: { red: 1, blue: 1, green: 1 }, output: { white: 0 } },
    { input: { red: 0.88, blue: 0.88, green: 0.88 }, output: { light: 0.1 } },
    { input: { red: 0.04, blue: 0.05, green: 0.04 }, output: { dark: 0.8 } },
    { input: { red: 0, blue: 0, green: 0 }, output: { black: 1 } }
]);

const result = network.run({ red: 0.94 }, { blue: 0 }, { green: 0.31 });

console.log(result);

const example = $("example")
$(document).ready(){
    $("color").on(`change`, (e) => {
        function getRgb(hex) {
            var shorthandRegex = /^#?([a-f\d])([a-f\d])([a-f\d])$/i;
            hex = hex.replace(shorthandRegex, function (m, r, g, b) {
                return r + r + g + g + b + b;
            });

            var result = /^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i.exec(hex);
            return result ? {
                r: Math.round(parseInt(result[1], 16) / 2.55) / 100,
                g: Math.round(parseInt(result[2], 16) / 2.55) / 100,
                b: Math.round(parseInt(result[3], 16) / 2.55) / 100,
            } : null;
        }

        example.css("background-color", e)
    })
}