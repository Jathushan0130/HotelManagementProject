package model;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date startDate;
    private Date endDate;
    // Add more attributes as needed

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Room room;

    @OneToMany
    private List<ProvidedService> providedServices;
    // Add more relationships as needed

    // Constructors, getters, and setters

    public Booking() {
        // Default constructor
    }

    public Booking(Date startDate, Date endDate, Customer customer, Room room, List<ProvidedService> providedServices) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        this.room = room;
        this.providedServices = providedServices;
        // Initialize other attributes if needed
    }

    // Getters and setters for all attributes

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<ProvidedService> getProvidedServices() {
        return providedServices;
    }

    public void setProvidedServices(List<ProvidedService> providedServices) {
        this.providedServices = providedServices;
    }
    // Add getters and setters for other attributes
}
