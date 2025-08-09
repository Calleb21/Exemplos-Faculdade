import { createServer} from 'http';
import { parse} from 'url';
import { readFile } from 'fs';

createServer(
    function (req, res) {
        let q = parse(req.url, true);
        let fileName = "C:\Users\calle\faculdadeDescomplica\Exemplos-Faculdade-Codigos\Exemplos-Faculdade\Exemplos-Faculdade-Codigos\Exemplos-Faculdade-Codigos\Exemplos-Faculdade-Codigos\exemplos-faculdade-descomplica\modulo3A\apresentacao-do-ambiente-e-conceitos-basicos\aula02.js\verao.html" + q.pathname;
        console.log(q);
        console.log(fileName);
        readFile(fileName, function (err, data) {
            console.log(err);
            if (err) {
                res.writeHead(404);
                res.end("404 Not Found");
                return;
            }
            res.writeHead(200);
            res.end(data);
        });
    }
).listen(8080);