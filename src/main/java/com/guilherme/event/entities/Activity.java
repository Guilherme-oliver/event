package com.guilherme.event.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "tb_activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "activity")
    private List<Block> blocks = new ArrayList<>();

    @OneToMany(mappedBy = "id.activity")
    private Set<EventsToAttend> attends = new HashSet<>();

    public Activity(Long id, String name, String description, Double price, Category category, Block block) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.blocks.add(block);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public Set<EventsToAttend> getAttends() {
        return attends;
    }

    public List<Participant> getParticipants() {
        return attends.stream().map(x -> x.getParticipant()).toList();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activity activity = (Activity) o;

        return Objects.equals(id, activity.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}