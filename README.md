# Tarea de Programación Orientada a Objetos: Herencia y Abstracción

## Discusión de los Cambios (Implementación de Herencia y Abstracción)

### 1. Generalización de la Clase Persona

**¿Qué podría hacer para mejorar que la clase 'Persona' sea lo suficientemente abstracta para permitir representar elementos propios del dominio problema?**

Para mejorar la abstracción y cumplir con el Principio de Responsabilidad Única (SRP), la clase 'Persona' se convirtió en una **clase abstracta base**.

* **Responsabilidad de 'Persona' (modelo.caso2.Persona):** Contiene solo las propiedades y métodos comunes a cualquier ser humano (ej. el nombre). Es el punto de partida genérico.
* **Especialización:** Las clases específicas del dominio (como **'Nino'** en el Caso 1 y **'Empleado'** en el Caso 2) heredan de 'Persona'. Esto les permite añadir propiedades y comportamientos específicos de su rol (ej. 'Nino' tiene la acción de 'irALaEscuela', y 'Empleado' tiene un 'idEmpleado' y una 'Moto' asociada) sin contaminar la clase base.

---

### 2. Generalización de los Animales (Caso 1)

**¿Cómo podría en el Caso 1 representar una situación más genérica para el caso de los animales?**

Se introdujo la **clase abstracta 'Animal'**.

* **Polimorfismo:** 'Animal' define el método abstracto **'hacerSonido()'**. Esto obliga a todas las subclases concretas (**'Perro'** y **'Gato'**) a implementar su propio sonido, logrando el polimorfismo en el comportamiento.
* **Comportamientos Comunes:** Implementa métodos comunes a todos, como 'comer()'.
* **Especialización:** 'Perro' y 'Gato' heredan de 'Animal' y añaden sus comportamientos únicos específicos del dominio (ej. 'Gato' tiene 'morder()' y 'rasgunar()').

---

### 3. Estructura Universitaria y Diagramas de Clases

**Si una universidad no se compone de carreras sino de facultades -> departamentos. ¿Cómo cambia eso sus diagramas de clases?**

* **Generalización de Estructuras:** Se introduce la **clase abstracta 'EntidadUniversitaria'** (base para estructuras académicas).
* **Cambios en el Diagrama (Relaciones):**
    * La composición anterior "Universidad -> Carrera" se reemplaza por:
        * **Composición:** "Universidad -> **Facultad**".
        * **Composición/Agregación:** "**Facultad** -> **Departamento**".
* **Implementación:** Las clases **'Facultad'** y **'Departamento'** heredan de 'EntidadUniversitaria', asegurando que la estructura es flexible y escalable (ej. si se introducen Escuelas). 'Facultad' mantiene una relación de composición con una lista de 'Departamento's.

---

### 4. Generalización en el Caso 2 (Persona, Moto y Empresa Naviera)

**Aplicando el mismo razonamiento anterior ¿Cómo se podría generalizar el análisis hecho en el Caso2 en la clase Persona, Moto y Empresa Naviera?**
* **Clase 'Persona':** Generalizada a la **clase abstracta 'Persona'** (como se explicó en el punto 1), con 'Empleado' como subclase concreta, permitiendo la herencia de propiedades básicas de identidad.
* **Clase 'Moto':** Generalizada a la **clase abstracta 'Vehiculo'**.
    * 'Moto' hereda de 'Vehiculo' y sobrescribe métodos como 'arrancar()'. Esto permite que el sistema se extienda fácilmente para manejar otros vehículos ('Coche', 'Camion') en el futuro sin modificar las clases que se relacionan con el 'Vehiculo' genérico (ej. 'Empleado').
* **Clase 'Empresa Naviera':** Se mantiene como una clase **especializada** debido a que su composición específica (Departamentos Navieros, Grupos de Proyecto) es muy particular del dominio problema. La abstracción en este contexto se aplica a las partes contenidas (ej. 'GrupoProyecto' y su asociación con 'Empleado').

* **la palabra "niño" fue reemplazada por "nino" debido a problemas de idioma en la configuración de intellij al momento de crear clases**
