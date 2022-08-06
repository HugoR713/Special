package com.special.controller.Pedido;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class Controller {


        @GetMapping
        public String Controller() {

            return "<!DOCTYPE html>\n" +
                    "<html lang=\"pt-br\">\n" +
                    "  <head>\n" +
                    "    <meta charset=\"UTF-8\" />\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
                    "\n" +
                    "    <title>Document</title>\n" +
                    "\n" +
                    "    <style>\n" +
                    "      * {\n" +
                    "        padding: 0;\n" +
                    "        margin: 0;\n" +
                    "        font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto,\n" +
                    "          Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;\n" +
                    "        color: white;\n" +
                    "        font-size: 1.5rem;\n" +
                    "      }\n" +
                    "\n" +
                    "      body {\n" +
                    "        display: flex;\n" +
                    "        justify-content: center;\n" +
                    "        align-items: center;\n" +
                    "        background-image: linear-gradient(45deg, #25002c, #150018);\n" +
                    "      }\n" +
                    "      .question {\n" +
                    "        gap: 1rem;\n" +
                    "        display: flex;\n" +
                    "        flex-direction: column;\n" +
                    "        align-items: center;\n" +
                    "        justify-content: center;\n" +
                    "        height: 100vh;\n" +
                    "        width: 26rem;\n" +
                    "        text-align: center;\n" +
                    "      }\n" +
                    "\n" +
                    "      .button {\n" +
                    "        border: 0;\n" +
                    "        padding: 0.5rem 1rem;\n" +
                    "        border-radius: 5px;\n" +
                    "        background-color: #db4de6;\n" +
                    "        text-align: center;\n" +
                    "        position: absolute;\n" +
                    "      }\n" +
                    "\n" +
                    "      #yes-button {\n" +
                    "        left: 2rem;\n" +
                    "      }\n" +
                    "\n" +
                    "      #no-button {\n" +
                    "        right: 2rem;\n" +
                    "      }\n" +
                    "\n" +
                    "      .button:hover {\n" +
                    "        background-color: #bb3fc4;\n" +
                    "      }\n" +
                    "      .answer {\n" +
                    "        position: relative;\n" +
                    "        display: flex;\n" +
                    "        justify-content: space-around;\n" +
                    "        width: 100%;\n" +
                    "      }\n" +
                    "    </style>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "    <div class=\"question\">\n" +
                    "      <img id=\"img\" src=\"\" />\n" +
                    "      <h1 id=\"text\">Quer casar comigo?</h1>\n" +
                    "      <div class=\"answer\">\n" +
                    "        <button onclick=\"aceitou()\" id=\"yes-button\" class=\"button\">SIM</button>\n" +
                    "        <button onmouseover=\"no()\" id=\"no-button\" class=\"button\">NÃO</button>\n" +
                    "      </div>\n" +
                    "    </div>\n" +
                    "  </body>\n" +
                    "  <script>\n" +
                    "    let yesButton = document.querySelector('#yes-button')\n" +
                    "    let noButton = document.querySelector('#no-button')\n" +
                    "    let noCounter = 0\n" +
                    "    let spaceW = screen.height\n" +
                    "    let spaceH = screen.width\n" +
                    "    let texto = document.querySelector('#text')\n" +
                    "\n" +
                    "    function evento() {\n" +
                    "      yesButton.innerHTML = 'SIM'\n" +
                    "      texto.innerHTML = 'Quer casar comigo?'\n" +
                    "      yesButton.removeEventListener('mouseover', evento)\n" +
                    "    }\n" +
                    "    function no() {\n" +
                    "      if (noCounter == 0) {\n" +
                    "        prompt('O que pensa que esta fazendo?')\n" +
                    "        navigator.vibrate(200)\n" +
                    "      } else if (noCounter >= 1 && noCounter <= 5) {\n" +
                    "        noButton.style.top = Math.round(Math.random() * spaceW) - 100 + 'px'\n" +
                    "        noButton.style.right = Math.round(Math.random() * spaceH) - 600 + 'px'\n" +
                    "\n" +
                    "        console.log(Math.round(Math.random() * spaceW))\n" +
                    "      } else if (noCounter == 6) {\n" +
                    "        noButton.style.top = '0rem'\n" +
                    "        noButton.style.right = '0rem'\n" +
                    "\n" +
                    "        texto.innerHTML = 'OK, Desisto, quer casar comigo?'\n" +
                    "        yesButton.innerHTML = 'NÃO'\n" +
                    "\n" +
                    "        yesButton.addEventListener('mouseover', evento)\n" +
                    "      } else if (noCounter > 6) {\n" +
                    "        novaJanela = window.open(\n" +
                    "          'nova.html',\n" +
                    "          'casa comigo',\n" +
                    "          `width=500, height=500`\n" +
                    "        )\n" +
                    "\n" +
                    "        novaJanela.document.documentURL = 'nova.html'\n" +
                    "        console.log(novaJanela.document.documentURI)\n" +
                    "\n" +
                    "        noButton.remove()\n" +
                    "      }\n" +
                    "\n" +
                    "      noCounter++\n" +
                    "      console.log(noCounter)\n" +
                    "    }\n" +
                    "    function aceitou() {\n" +
                    "      let img = document.querySelector('#img')\n" +
                    "      yesButton.remove()\n" +
                    "      noButton.remove()\n" +
                    "      texto.innerHTML = 'ACEITOU JA? Sabia que aceitaria 😅😅  Eu amo você ♥'\n" +
                    "      img.src =\n" +
                    "        'https://www.gifcen.com/wp-content/uploads/2021/02/love-gif-2.gif'\n" +
                    "    }\n" +
                    "  </script>\n" +
                    "</html>";
        }
    }

