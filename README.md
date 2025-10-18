PROYECTO INTEGRADOR IGNACIO TOMÁS MOLINA - ENTREGA PRIMER SPRINT

Documentación: https://docs.google.com/document/d/18FSy6IEQ67U-pD987lREGIaZUdcfxeNgF5xjmc39VVs/edit?tab=t.0#heading=h.g4mnf55vhi2x


COMO LEVANTAR EL PROYECTO:
1- Ingresar a /pi-backend-itm/digital-payment-molina
2- Abrir una consola
3- Ejecutar los siguientes comandos:
  docker stop digital-payment-backend
  docker rm digital-payment-backend
  docker build -t pi-backend-itm-backend .
  docker-compose up -d

Documentación API: http://localhost:8080/swagger-ui.html
