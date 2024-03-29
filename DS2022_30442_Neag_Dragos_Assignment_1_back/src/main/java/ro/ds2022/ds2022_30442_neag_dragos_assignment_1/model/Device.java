package ro.ds2022.ds2022_30442_neag_dragos_assignment_1.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "device")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "address", nullable = false)
    private String address;

    @OneToMany(mappedBy = "device", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ConsumptionDetails> consumptionDetails;

    @ManyToMany(mappedBy = "devices")
    private List<Client> clients;

    public Device() {
    }

    public Device(String name, String description, String address, List<ConsumptionDetails> consumptionDetails, List<Client> clients) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.consumptionDetails = consumptionDetails;
        this.clients = clients;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ConsumptionDetails> getConsumptionDetails() {
        return consumptionDetails;
    }

    public void setConsumptionDetails(List<ConsumptionDetails> consumptionDetails) {
        this.consumptionDetails = consumptionDetails;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
