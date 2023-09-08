# Proyecto de Automatización con Serenity BDD y Gradle: Consultas a Wikipedia

Este proyecto utiliza Serenity BDD con Gradle para automatizar las consultas a la página web de Wikipedia. En este README, te guiaré sobre cómo configurar y ejecutar este proyecto.

## Prerrequisitos:

- Java JDK 8 o superior instalado.
- Gradle instalado.
- Navegador (por defecto: Chrome).
- Driver correspondiente al navegador (p.ej., ChromeDriver para Chrome) en el PATH.

## Configuración inicial:

1. Clona este repositorio:
   git clone https://github.com/djjnn/PruebaValid

   o
   
2. Descargar este repositorio:
   https://drive.google.com/file/d/1edWw81zg1AmV-MQGQjHeTCCMhKOC8KpK/view?usp=sharing
    
3. Navega al directorio del proyecto:
   cd PruebaValid

4. Descarga las dependencias necesarias con Gradle:
   gradle clean build -x test

## Ejecutar las pruebas:

Para ejecutar las pruebas usando Serenity BDD y Gradle, sigue los siguientes pasos:

1. Desde el directorio raíz del proyecto, ejecuta:
   gradle clean test aggregate

2. Una vez que las pruebas hayan finalizado, puedes ver los informes generados en `target/site/serenity/index.html`. Abre este archivo en un navegador para ver un resumen detallado de las pruebas.

## Configuración adicional:

### Cambiar el navegador:

Por defecto, las pruebas se ejecutan en Chrome. Si deseas utilizar otro navegador, puedes especificarlo con la propiedad `webdriver.driver`. Por ejemplo, para usar Firefox:

### Ejecutar un escenario específico:

Si deseas ejecutar un escenario específico, puedes utilizar el siguiente comando, reemplazando `[nombre_del_escenario]` con el nombre del escenario que desees ejecutar:
gradle clean test -Dtest.single=[nombre_del_escenario] aggregate

## Contribuir:

Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama con un nombre descriptivo de tu contribución.
3. Realiza tus cambios y pruebas.
4. Haz un pull request a este repositorio describiendo tus cambios.

## Licencia:

Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para obtener más detalles.

## Soporte:

Si encuentras algún problema o tienes alguna sugerencia, por favor abre un nuevo issue en el repositorio de GitHub.
