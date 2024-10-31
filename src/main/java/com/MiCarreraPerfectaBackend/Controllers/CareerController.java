package com.MiCarreraPerfectaBackend.Controllers;

import com.MiCarreraPerfectaBackend.Config.WebApiResponse;
import com.MiCarreraPerfectaBackend.Services.CareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Arboit
 */
@RestController
@RequestMapping("/career")
public class CareerController {

    @Autowired
    private final CareerService careerService;

    public CareerController() {
        this.careerService = new CareerService();
    }

    /**
     * Esta función de Java recupera todas las carreras y las devuelve como WebApiResponse.
     * 
     * @return Se devuelve un objeto WebApiResponse, que contiene un código de respuesta, un mensaje y
     * una lista de objetos Career recuperados del método careerService.getAllCareers().
     */
    @GetMapping
    public WebApiResponse getAllCareers() {
        return WebApiResponse.newResponse(-1, "Status: ", careerService.getAllCareers());
    }

    /**
     * Esta función de Java recupera datos profesionales por ID y los devuelve en un objeto
     * WebApiResponse.
     * 
     * @param id El parámetro `id` en el método `getById` se utiliza para especificar el identificador
     * único de la carrera que desea recuperar de la base de datos. Este método recupera los datos de
     * la carrera en función del "id" proporcionado y devuelve un objeto "WebApiResponse" que contiene
     * la información de la carrera recuperada.
     * @return El método `getById` devuelve un objeto `WebApiResponse`. Este objeto se crea usando el
     * método `WebApiResponse.newResponse` con los parámetros `-1` para el código de estado,
     * `"Status:"` para el mensaje y `datos` (que son los datos de carrera recuperados llamando a
     * `careerService.getCareerById (id)`) como los datos.
     */
    @GetMapping("/{id}")
    public WebApiResponse getById(@PathVariable int id) {
        return WebApiResponse.newResponse(-1, "Status: ", careerService.getCareerById(id));
    }

    /**
     * Esta función de Java recupera una lista de carreras según una duración específica y devuelve los
     * datos en un objeto WebApiResponse.
     * 
     * @param duration El parámetro `duración` en el método `getByDuration` se utiliza como parámetro
     * de solicitud para filtrar y recuperar una lista de objetos `Career` según la duración
     * especificada. El método llama al método `careerService.getByDuration(duration)` para recuperar
     * los datos y luego construye una `WebApiResponse`
     * @return Se devuelve un objeto WebApiResponse, que contiene los datos de respuesta para la
     * solicitud realizada al endpoint "/get/byDuration".
     */
    @GetMapping("/duration/{duration}")
    public WebApiResponse getByDuration(@PathVariable int duration) {
        return WebApiResponse.newResponse(-1, "Status: ", careerService.getByDuration(duration));
    }

    /**
     * Esta función Java recupera una lista de objetos Career con una duración mayor que un valor
     * especificado y devuelve un objeto WebApiResponse que contiene los datos recuperados.
     * 
     * @param duration El `@RequestParam("duration") int length` en el método `getMethodName` indica
     * que el método espera que se pase un parámetro de consulta llamado "duration" de tipo entero en
     * la URL de solicitud. Este método recupera una lista de objetos `Career` del `careerService`
     * donde la duración es
     * @return Se devuelve un objeto WebApiResponse.
     */
    @GetMapping("/greaterduration/{duration}")
    public WebApiResponse getMethodName(@PathVariable int duration) {
        return WebApiResponse.newResponse(-1, "Status: ", careerService.getByDurationGreater(duration));
    }

    /**
     * Esta función Java utiliza una solicitud GET para recuperar datos profesionales por nombre y
     * devuelve un objeto WebApiResponse con los datos recuperados.
     * 
     * @param name La anotación `@RequestParam("name")` en el método `getByName` se utiliza para
     * extraer el valor del parámetro de consulta "nombre" de la URL de solicitud. Luego, este valor se
     * pasa como parámetro al método `getByName` de `careerService` para recuperar una lista de
     * @return El método devuelve un objeto WebApiResponse con un código de estado de -1, un mensaje
     * "Estado:" y una lista de objetos Carrera recuperados llamando al método
     * carreraService.getByName(nombre).
     */
    @GetMapping("/name/{name}")
    public WebApiResponse getByName(@PathVariable String name) {
        return WebApiResponse.newResponse(-1, "Status: ", careerService.getByName(name));
    }

    /**
     * La función devuelve el recuento de datos de un servicio profesional como un objeto
     * WebApiResponse.
     * 
     * @return Se devuelve un objeto WebApiResponse con el recuento de datos del servicio profesional.
     * La respuesta incluye un código de estado de -1, un mensaje "Estado:" y el recuento de datos.
     */
    @GetMapping("/count")
    public WebApiResponse count() {
        return WebApiResponse.newResponse(-1, "Status: ", careerService.count());
    }

    /**
     * Esta función Java recupera el recuento de datos por nombre de un servicio y lo devuelve en un
     * objeto WebApiResponse.
     * 
     * @param name La anotación `@RequestParam("name")` en el método `getMethodName` se utiliza para
     * extraer el valor del parámetro `name` de la URL de solicitud. Este método se asigna al punto
     * final `/get/countByName` y espera un parámetro de consulta llamado `name`.
     * @return Se devuelve una instancia de WebApiResponse.
     */
    @GetMapping("/countname/{name}")
    public WebApiResponse getMethodName(@PathVariable String name) {
        return WebApiResponse.newResponse(-1, "Status: ", careerService.countByName(name));
    }

    /**
     * Esta función de Java recupera una lista de carreras basadas en un ID de tipo específico y
     * devuelve los datos en un objeto WebApiResponse.
     * 
     * @param id El parámetro `typeId` en el endpoint `get/byTypeId` se utiliza para especificar
     * el tipo de carrera para la cual desea recuperar datos. El endpoint obtendrá una lista de
     * carreras según el valor "typeId" proporcionado.
     * @return El método `getByTypeId` en el controlador devuelve un objeto `WebApiResponse`. Este
     * objeto se crea con un código de estado de -1, un mensaje de "Estado:" y una lista de objetos
     * `Career` recuperados del método `careerService.getByTypeId(typeId)`.
     */
    @GetMapping("/type/{id}")
    public WebApiResponse getByTypeId(@PathVariable int id) {
        return WebApiResponse.newResponse(-1, "Status: ", careerService.getByTypeId(id));
    }

    /**
     * Esta función de Java recupera una lista de carreras basada en un ID de sucursal específico y
     * devuelve los datos en un objeto WebApiResponse.
     * 
     * @param id El parámetro `branchId` es un valor entero que se pasa como parámetro de
     * solicitud en la URL al llamar al endpoint `/get/byBranchId`. Este método recupera una lista
     * de carreras según el "branchId" proporcionado.
     * @return El método devuelve un objeto WebApiResponse con un código de estado de -1, un mensaje
     * "Estado:" y una lista de objetos Career recuperados llamando al método
     * carreraService.getByBranchId(branchId).
     */
    @GetMapping("/branch/{id}")
    public WebApiResponse getByBranchId(@PathVariable int id) {
        return WebApiResponse.newResponse(-1, "Status: ", careerService.getByBranchId(id));
    }

    /**
     * Esta función Java recupera una lista de objetos Career en función de un parámetro rangeId
     * especificado y devuelve un objeto WebApiResponse que contiene los datos recuperados.
     * 
     * @param id El parámetro `rangeId` es un valor entero que se pasa como parámetro de solicitud
     * en la URL al llamar al endpoint `/get/byRangeId`. Este método recupera una lista de objetos
     * "Carrera" según el valor "rangeId" proporcionado.
     * @return El método `getByRangeId` en el controlador devuelve un objeto `WebApiResponse`. Este
     * objeto se crea con un código de estado de -1, un mensaje "Estado:" y una lista de objetos
     * `Career` recuperados del método `careerService.getByRangeId(rangeId)`.
     */
    @GetMapping("/range/{id}")
    public WebApiResponse getByRangeId(@PathVariable int id) {
        return WebApiResponse.newResponse(-1, "Status: ", careerService.getByRangeId(id));
    }

    /**
     * Esta función de Java recupera una lista de carreras según un ID de modalidad determinado y
     * devuelve los datos en un objeto WebApiResponse.
     * 
     * @param id El parámetro `modalityId` es un valor entero que representa el ID de una
     * modalidad. Este método es un mapeo GET que recupera una lista de carreras según el "modalityId"
     * proporcionado.
     * @return Se devuelve un objeto WebApiResponse, que contiene un código de respuesta, un mensaje de
     * estado y una lista de objetos Career recuperados según el modalityId proporcionado.
     */
    @GetMapping("/modality/{id}")
    public WebApiResponse getByModalityId(@PathVariable int id) {
        return WebApiResponse.newResponse(-1, "Status: ", careerService.getByModalityId(id));
    }

    /**
     * Esta función de Java recupera datos de carrera por un título intermedio y los devuelve en una
     * WebApiResponse.
     * 
     * @param title Se espera que el parámetro `title` en el método `getByTitleIntermediate` sea un
     * valor entero. Este método es un mapeo GET que recupera una lista de objetos "Carrera" en función
     * de una coincidencia de título intermedia. El método llama al método `getByTitleIntermediate`
     * desde `careerService
     * @return Se devuelve un objeto WebApiResponse, que contiene un código de respuesta, un mensaje de
     * estado y una lista de objetos Career recuperados por el método
     * careerService.getByTitleIntermediate(title).
     */
    @GetMapping("/titleintermediate/{title}")
    public WebApiResponse getByTitleIntermediate(@PathVariable int title) {
        return WebApiResponse.newResponse(-1, "Status: ", careerService.getByTitleIntermediate(title));
    }

}