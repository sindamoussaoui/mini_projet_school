RAPPORT – MINI PROJET JAVA AVANCÉ Architecture Spring Boot / Spring Data JPA 1.Introduction Ce projet consiste à développer un microservice de gestion d’une école en utilisant Spring Boot et Spring Data JPA. L’objectif principal est de mettre en pratique l’architecture en couches ainsi que la gestion des relations entre entités via JPA. 2. Technologies utilisées Java 21 Spring Boot Spring Data JPA PostgreSQL Hibernate IntelliJ IDEA Postman Postman 3. Architecture du projet

Le projet suit une architecture en couches :

Controller (REST API) Service (logique métier) Repository (accès aux données) Entities (modèle JPA) 4. Partie 1 : School et Department Relation School (1) → (N) Department Une School contient plusieurs Departments Schéma CAS 1 t_school (PK_school, name, phone) t_department (pk_department, name) t_school_t_department (table de jointure) Schéma CAS 2 (bidirectionnel recommandé) t_school (PK_school, name, phone) t_department (pk_department, name, school_id FK) Schéma CAS 3 (unidirectionnel) t_school (PK_school, name, phone) t_department (pk_department, name, school_id FK) ✅ Schéma le plus adéquat

CAS 2 est le meilleur choix

✔ Justification : FK directement dans t_department pas de table inutile navigation bidirectionnelle performance optimale respect du modèle relationnel Partie 2 : Student et Address 🔗 Relation Student (1) → (1) Address CAS 1 (bidirectionnel) FK dans address + navigation dans les deux sens CAS 2 (unidirectionnel recommandé) t_student (PK_Student, name, birthDate, address_id FK) t_address (PK_Address, city, street, postalCode) ✅ Schéma le plus adéquat

CAS 3 (unidirectionnel Student → Address)

✔ Justification : Student possède son Address pas besoin de navigation inverse simplicité et bonne conception conforme à l’énoncé Partie 3 : Instructor et Course Relation Instructor (N) ↔ (M) Course Schéma CAS 1 table de jointure inutile parfois Schéma CAS 2 (recommandé) t_instructor (pk_instructor, name) t_course (pk_course, name) t_instructor_course (instructor_id, course_id) ✅ Schéma le plus adéquat

CAS 2 (bidirectionnel avec table de jointure)

✔ Justification : relation ManyToMany standard flexibilité navigation dans les deux sens bonne normalisation

Schéma global final (SchoolDB) t_school t_department t_student t_address t_instructor t_course t_instructor_course
Service SchoolService
Le service contient la logique métier :

création School avec relations création Student + Address gestion Instructor + Courses listage des entités recherche par ID

API REST (TestSchoolController)
Les endpoints permettent de tester :

POST /schools POST /students POST /instructors GET /students GET /instructors/{id} GET /courses/{id}

Tests
Les tests sont effectués avec Postman pour vérifier : création des entités relations JPA récupération des données

Conclusion
Ce projet permet de maîtriser :

Spring Boot JPA/Hibernate relations OneToOne / OneToMany / ManyToMany architecture en couches développement d’API REST
