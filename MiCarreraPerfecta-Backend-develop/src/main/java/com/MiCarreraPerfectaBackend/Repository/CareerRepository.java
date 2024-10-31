package com.MiCarreraPerfectaBackend.Repository;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;
import com.MiCarreraPerfectaBackend.Entity.Career;
import jakarta.persistence.*;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 *
 * @author Arboit
 */
@Repository
public class CareerRepository implements JpaRepository<Career, Integer> {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Esta función Java recupera una lista de objetos Carrera con una duración
     * mayor que un valor especificado.
     *
     * @param duration El parámetro `duración` en el método
     * `findByDurationGraterThan` representa la duración mínima en meses que
     * debe tener una carrera para ser incluida en el resultado. El método
     * recupera una lista de objetos "Carrera" cuya duración es mayor que el
     * valor de "duración" especificado.
     * @return Este método devuelve una lista de objetos de Carrera donde la
     * duración en meses es mayor que el parámetro de duración especificado.
     */
    public List<Career> findByDurationGraterThan(Integer duration) {
        TypedQuery<Career> query = entityManager.createQuery(
                "SELECT c FROM Career c WHERE c.duration_months > :duration", Career.class);
        query.setParameter("duration", duration);
        return query.getResultList();

    }

    /**
     * Esta función de Java recupera una lista de objetos de carrera según la
     * duración especificada en meses.
     *
     * @param duration El método `findByDuration_months` se utiliza para
     * recuperar una lista de objetos `Career` según la duración proporcionada
     * en meses. El método toma un parámetro `Entero` `duración` que representa
     * la duración en meses que desea buscar en la base de datos.
     * @return Este método devuelve una lista de objetos de Carrera que tienen
     * una duración en meses que coincide con el parámetro de entrada
     * "duración".
     */
    public List<Career> findByDuration_months(Integer duration) {
        TypedQuery<Career> query = entityManager.createQuery(
                "SELECT c FROM Career c WHERE c.duration_months = :duration", Career.class);
        query.setParameter("duration", duration);
        return query.getResultList();

    }

    /**
     * Esta función de Java recupera una lista de objetos de carrera en función
     * de una ID de rama especificada.
     *
     * @param id_branch El método `findById_branch` se utiliza para recuperar
     * una lista de objetos `Career` basados en el parámetro `id_branch`. El
     * parámetro `id_branch` es un valor entero que se utiliza para filtrar las
     * carreras según la rama a la que pertenecen.
     * @return Este método devuelve una lista de objetos Career que pertenecen a
     * una rama específica identificada por el parámetro id_branch
     * proporcionado.
     */
    public List<Career> findById_branch(Integer id_branch) {
        TypedQuery<Career> query = entityManager.createQuery(
                "SELECT c FROM Career c WHERE c.id_branch = :id_branch", Career.class);
        query.setParameter("id_branch", id_branch);
        return query.getResultList();
    }

    /**
     * Esta función Java recupera una lista de objetos Career según el parámetro
     * id_type_career proporcionado.
     *
     * @param id_type_career El método `findById_type_career` está diseñado para
     * recuperar una lista de objetos `Career` basándose en el parámetro
     * `id_type_career` proporcionado. La consulta busca entidades "Career"
     * donde el atributo "id_type_career" coincida con el valor del parámetro de
     * entrada.
     * @return El método devuelve una lista de objetos de carrera que coinciden
     * con el parámetro id_type_career proporcionado.
     */
    public List<Career> findById_type_career(Integer id_type_career) {
        TypedQuery<Career> query = entityManager.createQuery(
                "SELECT c FROM Career c WHERE c.id_type_career = :id_type_career", Career.class);
        query.setParameter("id_type_career", id_type_career);
        return query.getResultList();
    }

    /**
     * Esta función de Java busca carreras por nombre mediante una consulta LIKE
     * con caracteres comodín.
     *
     * @param name El parámetro `name` en el método `findByName` se utiliza para
     * buscar carreras cuyo nombre contenga el valor especificado. El método
     * realiza una búsqueda que no distingue entre mayúsculas y minúsculas
     * utilizando el operador "LIKE" en la consulta JPQL para encontrar carreras
     * que coincidan parcialmente con el nombre proporcionado.
     * @return Este método devuelve una lista de objetos Carrera que coinciden
     * con el nombre de pila o contienen el nombre de pila como una subcadena.
     */
    public List<Career> findByName(String name) {
        TypedQuery<Career> query = entityManager.createQuery(
                "SELECT c FROM Career c WHERE c.name LIKE '%" + name + "%'", Career.class);
        return query.getResultList();
    }

    /**
     * La función findAll() recupera todos los objetos Career de la base de
     * datos mediante una consulta JPQL.
     *
     * @return El método `findAll` devuelve una lista de objetos `Career`.
     */
    @SuppressWarnings("null")
    @Override
    public List<Career> findAll() {
        TypedQuery<Career> query = entityManager.createQuery("SELECT c FROM Career c", Career.class);
        return query.getResultList();
    }

    /**
     * Esta función recupera una entidad de carrera por su ID de la base de
     * datos y la devuelve como opcional.
     *
     * @param id_career El método `findById` se utiliza para recuperar una
     * entidad `Career` por su campo `id_career`. El parámetro `id_career` es el
     * identificador único de la carrera que desea encontrar en la base de
     * datos. El método ejecuta una consulta JPQL para seleccionar una "Carrera"
     * @return El método devuelve un objeto "Opcional" que puede contener una
     * entidad "Carrera" si se encuentra en función del "id_career"
     * proporcionado. Si no se encuentra ninguna entidad, devolverá un
     * "Opcional" vacío.
     */
    @SuppressWarnings("null")
    @Override
    public Optional<Career> findById(Integer id_career) {
        TypedQuery<Career> query = entityManager.createQuery("SELECT c FROM Career c WHERE c.id_career = :id_career",
                Career.class);
        query.setParameter("id_career", id_career);
        try {
            return Optional.ofNullable(query.getSingleResult());
        } catch (NoResultException e) {
            return Optional.empty();
        }
    }

    /**
     * Esta función Java recupera una lista de objetos Career en función de un
     * parámetro id_range especificado.
     *
     * @param id_range El método `findById_range` toma un parámetro `Integer`
     * llamado `id_range`. Este parámetro se utiliza en la consulta para filtrar
     * y recuperar una lista de objetos "Career" donde el atributo "id_range"
     * coincide con el valor del parámetro "id_range" proporcionado.
     * @return Este método devuelve una lista de objetos Carrera que coinciden
     * con el parámetro id_range especificado.
     */
    public List<Career> findById_range(Integer id_range) {
        TypedQuery<Career> query = entityManager.createQuery(
                "SELECT c FROM Career c WHERE c.id_range = :id_range", Career.class);
        query.setParameter("id_range", id_range);
        return query.getResultList();
    }

    /**
     * Esta función de Java recupera una lista de objetos de carrera en función
     * de un parámetro id_modality determinado.
     *
     * @param id_modality El parámetro `id_modality` se utiliza para filtrar la
     * lista de objetos `Career` según el ID de modalidad especificado. El
     * método `findById_modality` toma un parámetro `Integer` `id_modality` y
     * recupera una lista de objetos `Career` que coinciden con el ID de
     * modalidad proporcionado
     * @return Este método devuelve una lista de objetos Carrera que coinciden
     * con el parámetro id_modality proporcionado.
     */
    public List<Career> findById_modality(Integer id_modality) {
        TypedQuery<Career> query = entityManager.createQuery(
                "SELECT c FROM Career c WHERE c.id_modality = :id_modality", Career.class);
        query.setParameter("id_modality", id_modality);
        return query.getResultList();
    }

    /**
     * Esta función de Java recupera una lista de objetos de Carrera basada en
     * un parámetro de título intermedio.
     *
     * @param title El método `findByTitleIntermediate` se utiliza para
     * recuperar una lista de objetos `Career` basados en el atributo
     * `title_intermediate` que coincide con el parámetro `title` proporcionado.
     * @return Este método devuelve una lista de objetos Career que tienen el
     * atributo title_intermediate que coincide con el título entero
     * proporcionado.
     */
    public List<Career> findByTitleIntermediate(Integer title) {
        TypedQuery<Career> query = entityManager.createQuery(
                "SELECT c FROM Career c WHERE c.title_intermediate = :title", Career.class);
        query.setParameter("title", title);
        return query.getResultList();
    }

    /**
     * Esta función cuenta el número total de registros en la entidad Carrera
     * mediante una consulta JPQL.
     *
     * @return El método `count()` devuelve el recuento total de entidades en la
     * clase de entidad `Career`. Ejecuta una consulta JPQL para seleccionar el
     * recuento de todas las entidades "Carrera" y devuelve el resultado como un
     * valor "Largo".
     */
    @Override
    public long count() {
        TypedQuery<Long> query = entityManager.createQuery("SELECT COUNT(c) FROM Career c", Long.class);
        return query.getSingleResult();
    }

    /**
     * Esta función de Java cuenta el número de entidades profesionales cuyo
     * nombre contiene una cadena especificada.
     *
     * @param name El método `countByName` toma un parámetro `String` llamado
     * `name`, que se utiliza para buscar carreras cuyo nombre contenga el valor
     * especificado. Luego, el método ejecuta una consulta para contar la
     * cantidad de carreras que coinciden con los criterios de nombre
     * proporcionados.
     * @return El método `countByName` devuelve el recuento de entidades
     * profesionales cuyo nombre contiene el nombre de entrada especificado.
     */
    public long countByName(String name) {
        TypedQuery<Long> query = entityManager
                .createQuery("SELECT COUNT(c) FROM Career c WHERE c.name LIKE '%" + name + "%'", Long.class);
        return query.getSingleResult();
    }

    @Override
    public <S extends Career> List<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public List<Career> findAllById(Iterable<Integer> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public <S extends Career> S save(S entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public boolean existsById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public void delete(Career entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends Career> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public List<Career> findAll(Sort sort) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<Career> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Career> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public <S extends Career> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Career> long count(Example<S> example) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public <S extends Career> boolean exists(Example<S> example) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exists'");
    }

    @Override
    public <S extends Career, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBy'");
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllByIdInBatch'");
    }

    @Override
    public void deleteAllInBatch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllInBatch'");
    }

    @Override
    public void deleteAllInBatch(Iterable<Career> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllInBatch'");
    }

    @Override
    public <S extends Career> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Career> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void flush() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'flush'");
    }

    @Override
    public Career getById(Integer arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Career getOne(Integer arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public Career getReferenceById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getReferenceById'");
    }

    @Override
    public <S extends Career> List<S> saveAllAndFlush(Iterable<S> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAllAndFlush'");
    }

    @Override
    public <S extends Career> S saveAndFlush(S entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAndFlush'");
    }
}
