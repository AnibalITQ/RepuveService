//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.02.25 a las 05:19:59 PM CST 
//


package com.itq.RepuveService.dto;


import javax.xml.datatype.XMLGregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="placa" type="{http://itq.com/parking/consultaRepuve}TipoPlaca"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reporteRobo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="niv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ejes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cilindros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="anio_modelo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="institucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pais_origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desplazamiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero_puertas" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="fecha_emplacado" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="reporte_usa_can" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hora_inscripcion" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="entidad_emplacado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha_inscripcion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="folio_inscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="planta_ensamblaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reporte_robo_ocra" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="datos_complementarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reporte_robo_procuraduria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fecha_ultima_actualizacion" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "placa",
    "modelo",
    "marca",
    "reporteRobo",
    "niv",
    "nci",
    "ejes",
    "tipo",
    "clase",
    "version",
    "cilindros",
    "anioModelo",
    "institucion",
    "paisOrigen",
    "desplazamiento",
    "numeroPuertas",
    "fechaEmplacado",
    "reporteUsaCan",
    "horaInscripcion",
    "entidadEmplacado",
    "fechaInscripcion",
    "folioInscripcion",
    "plantaEnsamblaje",
    "reporteRoboOcra",
    "datosComplementarios",
    "reporteRoboProcuraduria",
    "fechaUltimaActualizacion"
})
@XmlRootElement(name = "EstadoVehiculo")
public class EstadoVehiculo {

    @XmlElement(required = true)
    protected String placa;
    @XmlElement(required = true)
    protected String modelo;
    protected String marca;
    protected boolean reporteRobo;
    @XmlElement(required = true)
    protected String niv;
    protected String nci;
    protected int ejes;
    protected String tipo;
    protected String clase;
    protected String version;
    protected String cilindros;
    @XmlElement(name = "anio_modelo")
    protected int anioModelo;
    protected String institucion;
    @XmlElement(name = "pais_origen")
    protected String paisOrigen;
    protected String desplazamiento;
    @XmlElement(name = "numero_puertas")
    protected int numeroPuertas;
    @XmlElement(name = "fecha_emplacado")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaEmplacado;
    @XmlElement(name = "reporte_usa_can")
    protected Boolean reporteUsaCan;
    @XmlElement(name = "hora_inscripcion")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaInscripcion;
    @XmlElement(name = "entidad_emplacado")
    protected String entidadEmplacado;
    @XmlElement(name = "fecha_inscripcion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInscripcion;
    @XmlElement(name = "folio_inscripcion")
    protected String folioInscripcion;
    @XmlElement(name = "planta_ensamblaje")
    protected String plantaEnsamblaje;
    @XmlElement(name = "reporte_robo_ocra")
    protected Boolean reporteRoboOcra;
    @XmlElement(name = "datos_complementarios")
    protected String datosComplementarios;
    @XmlElement(name = "reporte_robo_procuraduria")
    protected Boolean reporteRoboProcuraduria;
    @XmlElement(name = "fecha_ultima_actualizacion")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaUltimaActualizacion;

    /**
     * Obtiene el valor de la propiedad placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define el valor de la propiedad placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obtiene el valor de la propiedad modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define el valor de la propiedad modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad reporteRobo.
     * 
     */
    public boolean isReporteRobo() {
        return reporteRobo;
    }

    /**
     * Define el valor de la propiedad reporteRobo.
     * 
     */
    public void setReporteRobo(boolean value) {
        this.reporteRobo = value;
    }

    /**
     * Obtiene el valor de la propiedad niv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNiv() {
        return niv;
    }

    /**
     * Define el valor de la propiedad niv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNiv(String value) {
        this.niv = value;
    }

    /**
     * Obtiene el valor de la propiedad nci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNci() {
        return nci;
    }

    /**
     * Define el valor de la propiedad nci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNci(String value) {
        this.nci = value;
    }

    /**
     * Obtiene el valor de la propiedad ejes.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getEjes() {
        return ejes;
    }

    /**
     * Define el valor de la propiedad ejes.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setEjes(int value) {
        this.ejes = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad clase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClase() {
        return clase;
    }

    /**
     * Define el valor de la propiedad clase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClase(String value) {
        this.clase = value;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad cilindros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCilindros() {
        return cilindros;
    }

    /**
     * Define el valor de la propiedad cilindros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCilindros(String value) {
        this.cilindros = value;
    }

    /**
     * Obtiene el valor de la propiedad anioModelo.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getAnioModelo() {
        return anioModelo;
    }

    /**
     * Define el valor de la propiedad anioModelo.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setAnioModelo(int value) {
        this.anioModelo = value;
    }

    /**
     * Obtiene el valor de la propiedad institucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitucion() {
        return institucion;
    }

    /**
     * Define el valor de la propiedad institucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitucion(String value) {
        this.institucion = value;
    }

    /**
     * Obtiene el valor de la propiedad paisOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * Define el valor de la propiedad paisOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigen(String value) {
        this.paisOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad desplazamiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesplazamiento() {
        return desplazamiento;
    }

    /**
     * Define el valor de la propiedad desplazamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesplazamiento(String value) {
        this.desplazamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPuertas.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * Define el valor de la propiedad numeroPuertas.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setNumeroPuertas(int value) {
        this.numeroPuertas = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmplacado.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmplacado() {
        return fechaEmplacado;
    }

    /**
     * Define el valor de la propiedad fechaEmplacado.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmplacado(XMLGregorianCalendar value) {
        this.fechaEmplacado = value;
    }

    /**
     * Obtiene el valor de la propiedad reporteUsaCan.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReporteUsaCan() {
        return reporteUsaCan;
    }

    /**
     * Define el valor de la propiedad reporteUsaCan.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReporteUsaCan(Boolean value) {
        this.reporteUsaCan = value;
    }

    /**
     * Obtiene el valor de la propiedad horaInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraInscripcion() {
        return horaInscripcion;
    }

    /**
     * Define el valor de la propiedad horaInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraInscripcion(XMLGregorianCalendar value) {
        this.horaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadEmplacado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadEmplacado() {
        return entidadEmplacado;
    }

    /**
     * Define el valor de la propiedad entidadEmplacado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadEmplacado(String value) {
        this.entidadEmplacado = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Define el valor de la propiedad fechaInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInscripcion(XMLGregorianCalendar value) {
        this.fechaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad folioInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolioInscripcion() {
        return folioInscripcion;
    }

    /**
     * Define el valor de la propiedad folioInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolioInscripcion(String value) {
        this.folioInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad plantaEnsamblaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlantaEnsamblaje() {
        return plantaEnsamblaje;
    }

    /**
     * Define el valor de la propiedad plantaEnsamblaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlantaEnsamblaje(String value) {
        this.plantaEnsamblaje = value;
    }

    /**
     * Obtiene el valor de la propiedad reporteRoboOcra.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReporteRoboOcra() {
        return reporteRoboOcra;
    }

    /**
     * Define el valor de la propiedad reporteRoboOcra.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReporteRoboOcra(Boolean value) {
        this.reporteRoboOcra = value;
    }

    /**
     * Obtiene el valor de la propiedad datosComplementarios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosComplementarios() {
        return datosComplementarios;
    }

    /**
     * Define el valor de la propiedad datosComplementarios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosComplementarios(String value) {
        this.datosComplementarios = value;
    }

    /**
     * Obtiene el valor de la propiedad reporteRoboProcuraduria.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReporteRoboProcuraduria() {
        return reporteRoboProcuraduria;
    }

    /**
     * Define el valor de la propiedad reporteRoboProcuraduria.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReporteRoboProcuraduria(Boolean value) {
        this.reporteRoboProcuraduria = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaUltimaActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimaActualizacion(XMLGregorianCalendar value) {
        this.fechaUltimaActualizacion = value;
    }

}
