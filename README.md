
# 🌍 Conversor de Monedas con API 💸


Un proyecto realizado como parte del challenge del programa Oracle Next Education de Alura LATAM.
Este proyecto en Java permite obtener datos de conversión de moneda utilizando la ExchangeRate-API. La clase principal que gestiona la obtención de los datos es GetDataAPI, que realiza solicitudes HTTP para recuperar las tasas de cambio entre diferentes monedas.

## 🚀 Funcionalidades Principales
1. Conversión de Moneda con Cantidad Personalizada
Convierte una cantidad específica entre dos monedas y guarda la transacción en una lista.

```
ArrayList<TransaccionGson> transacciones = new ArrayList<>();
GetDataAPI api = new GetDataAPI();
String resultado = api.findData("USD", "EUR", transacciones, 100);
System.out.println(resultado); // Resultado: "100 USD son 92.34 EUR"
```

2. Conversión Estándar (1 USD a Otra Moneda)
Convierte 1 USD a una moneda específica y guarda el resultado.

```
ArrayList<TransaccionGson> transacciones = new ArrayList<>();
GetDataAPI api = new GetDataAPI();
String resultado = api.findData("JPY", transacciones);
System.out.println(resultado); // Resultado: "1 USD son 110.23 JPY"
```

## 🛠️ Estructura del Proyecto
GetDataAPI.java: Contiene los métodos para obtener datos de conversión de moneda desde la API y maneja la respuesta JSON con Gson.
TransaccionGson.java: Define la estructura de los objetos TransaccionGson, que contienen detalles sobre la tasa de cambio.
EscrituraJson.java: Guarda las transacciones realizadas en un archivo JSON.
Ascii.java: Proporciona representaciones gráficas ASCII como banderas y banners.
AplicacionCambioDeMoneda.java: Clase principal que gestiona la lógica completa del programa, incluyendo la interfaz de usuario.

## 🌐 Uso de la API
Este programa utiliza ExchangeRate-API para obtener tasas de cambio. Los endpoints utilizados son:

```
https://v6.exchangerate-api.com/v6/{API_KEY}/pair/{BASE}/{TARGET}/{AMOUNT}
https://v6.exchangerate-api.com/v6/{API_KEY}/pair/USD/{BASE}/1
```

## 🔑 Configuración de la API:
Asegúrate de registrar una cuenta en ExchangeRate-API para obtener tu clave de API (API_KEY).

## 📦 Dependencias
Gson: Para la serialización y deserialización de JSON.
HttpClient: Para realizar solicitudes HTTP a la API.
Instalación con Maven
Agrega la dependencia de Gson en tu archivo pom.xml:

xml
```
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version>
</dependency>
```

## 📝 Ejecución
Clona este repositorio:

```
git clone https://github.com/tu_usuario/ConversorMonedasConApi.git
```
Agrega tu clave de API en las URLs de las solicitudes en GetDataAPI.java.

Compila y ejecuta el programa:

```
javac -d bin src/*.java
java -cp bin API.GetDataAPI
```
