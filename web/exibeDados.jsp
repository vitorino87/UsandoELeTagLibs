<%-- 
    Document   : exibeDados
    Created on : 22/02/2016, 18:18:10
    Author     : tiago.lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Produto Obtido</title>
        <style type="text/css">
            .alinharDireita{
                text-align: right;
            }
        </style>
    </head>
    <body>
        <h1>Produto Obtido</h1>
        <table>
            <tr>
                <td class="alinharDireita">Código:</td>
                <td>${requestScope.produtoObtido.codigo}</td>
            </tr>
            <tr>
                <td class="alinharDireita">Descrição:</td>
                <td>${requestScope.produtoObtido.descricao}</td>
            </tr>
            <tr>
                <td class="alinharDireita">Unidade de Medida::</td>
                <td>${requestScope.produtoObtido.unidadeMedida}</td>
            </tr>
            <tr>
                <td class="alinharDireita">Quant. em Estoque:</td>
                <td>${requestScope.produtoObtido.quantidade}</td>
            </tr>
            <tr>
                <td colspan="2">
                    <a href="index.html">Voltar</a>
                </td>
            </tr>
        </table>
    </body>
</html>
