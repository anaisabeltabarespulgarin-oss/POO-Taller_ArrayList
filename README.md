Parte C. Retos:
1. Escribe una versión de eliminarArtista que recorra con for-each y elimine dentro del ciclo. Úsala sobre Viaje
para eliminar a Nevado, copia la excepción y explica por qué ocurre.
si se intenta eliminar un elemento de una lista mientras se recorre un for-each java se asusta lanza un error : ConcurrentModificationException y esto genera que se descontrole el programa por seguridad.
4. Intenta crear un Puesto desde parqueadero.app. Copia el error y explica qué tiene que ver con la composición.
ya que si se crea un puesto desde otra parte del programa java lo rechaza el acceso por seguridad, lo hace para proteger la relación de composición porque los puestos nacen y dependen solamente del parqueadero.
5. Predice la salida sin ejecutar y dibuja la lista y los objetos al final. Luego compruébala.
porque al meter 2 veces x, se guarda dos veces ese mismo objeto por eso da true al comparar el 1 y 0. Pero si creamos uno con new aunque tenga la misma información no estará en el mismo espacio de la memoria por eso da false. Y si borramos x solo estamos borrando 1 por lo tanto queda la 2da x.

Preguntas:
1. ¿Por qué ArrayList<int> no compila y ArrayList<Integer> sí?
porque las listas en java solo aceptan objetos y INT es un número de tipo primitivo por eso la lista no lo deja entrar, en cambio Integer es como la versión objeto de ese número de tipo primitivo.
2. ¿Por qué eliminar a Nevado de Favoritas no lo eliminó de Viaje? ¿Qué relación muestra eso?
porque favoritos y viaje son distintos o sea están separados por ello si borramos una la otra seguira existiendo, es una relación de asociación.
3. ¿Qué diferencia hay entre la relación Playlist–Cancion y la relación Parqueadero–Puesto?
las relaciones son:
Playlist-Canción: es de asociación ya que una canción puede estar sola o también puede estar en varias listas a la vez.
Parqueadero-Puesto: es de composición ya que los puestos le pertenecen al parqueadero, lo que quiere decir que si no hay parqueadero tampoco existirán puestos.
4. ¿Por qué totalCanciones debe ser static y titulo no?
porque titulo es como un dato único cada canción tiene su propio nombre mientras que totalCanciones es como un dato compartido para toda la clase, no para una sola canción ,o sea es global.
5. ¿Por qué un método static no puede usar this?
porque this es para un objeto especifico mientras que static es para una clase en general.

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/2540c3c2-d0e0-4232-9853-289654b79955" />


<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/ff207915-d400-44fe-bb9b-5ba7f2a2c763" />

