package io.swagger.model;

import java.time.LocalDate;
import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Profile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-03T19:26:46.543Z")

@Entity
@Table(name="USERPROFILES")
public class Profile   {

  @Id
  @Column(name="Id")
  private String id = null;

  @Column(name="FIRSTNAME")
  private String firstName = null;

  @Column(name="LASTNAME")
  private String lastName = null;

  @Column(name="USERID")
  private String userId = null;

  @Column(name="PROFILEPICTUREURI")
  private String profilePictureUri = null;

  @Column(name="RATING")
  private Integer rating = null;

  @Column(name="RANKING")
  private Integer ranking = null;

  @Column(name="TOTALDISTANCE")
  private Float totalDistance = null;

  @Column(name="TOTALTRIPS")
  private Integer totalTrips = null;

  @Column(name="TOTALTIME")
  private Integer totalTime = null;

  @Column(name="HARDSTOPS")
  private Integer hardStops = null;

  @Column(name="HARDACCELERATIONS")
  private Integer hardAccelerations = null;

  @Column(name="FUELCONSUMPTION")
  private Float fuelConsumption = null;

  @Column(name="MAXSPEED")
  private Float maxSpeed = null;

  @Column(name="CREATEDAT")
  private LocalDate createdAt;

  @Column(name="UPDATEDAT")
  private LocalDate updatedAt;

  @Column(name="DELETED")
  private Boolean deleted = null;

  public Profile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * User's unique identity
   * @return id
  **/
  @ApiModelProperty(value = "User's unique identity")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Profile firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^[A-Za-z  -][a-zA-Z  -]*$") @Size(min=0,max=50) 
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Profile lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^[A-Za-z  -][a-zA-Z  -]*$") @Size(min=0,max=80) 
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Profile userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * User's identity
   * @return userId
  **/
  @ApiModelProperty(value = "User's identity")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Profile profilePictureUri(String profilePictureUri) {
    this.profilePictureUri = profilePictureUri;
    return this;
  }

  /**
   * User's Profile picture
   * @return profilePictureUri
  **/
  @ApiModelProperty(value = "User's Profile picture")


  public String getProfilePictureUri() {
    return profilePictureUri;
  }

  public void setProfilePictureUri(String profilePictureUri) {
    this.profilePictureUri = profilePictureUri;
  }

  public Profile rating(Integer rating) {
    this.rating = rating;
    return this;
  }

  /**
   * User's rating
   * @return rating
  **/
  @ApiModelProperty(value = "User's rating")


  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public Profile ranking(Integer ranking) {
    this.ranking = ranking;
    return this;
  }

  /**
   * User's ranking
   * @return ranking
  **/
  @ApiModelProperty(value = "User's ranking")


  public Integer getRanking() {
    return ranking;
  }

  public void setRanking(Integer ranking) {
    this.ranking = ranking;
  }

  public Profile totalDistance(Float totalDistance) {
    this.totalDistance = totalDistance;
    return this;
  }

  /**
   * User's total distance traveled
   * @return totalDistance
  **/
  @ApiModelProperty(value = "User's total distance traveled")


  public Float getTotalDistance() {
    return totalDistance;
  }

  public void setTotalDistance(Float totalDistance) {
    this.totalDistance = totalDistance;
  }

  public Profile totalTrips(Integer totalTrips) {
    this.totalTrips = totalTrips;
    return this;
  }

  /**
   * User's total number of trips
   * @return totalTrips
  **/
  @ApiModelProperty(value = "User's total number of trips")


  public Integer getTotalTrips() {
    return totalTrips;
  }

  public void setTotalTrips(Integer totalTrips) {
    this.totalTrips = totalTrips;
  }

  public Profile totalTime(Integer totalTime) {
    this.totalTime = totalTime;
    return this;
  }

  /**
   * User's total driving time
   * @return totalTime
  **/
  @ApiModelProperty(value = "User's total driving time")


  public Integer getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(Integer totalTime) {
    this.totalTime = totalTime;
  }

  public Profile hardStops(Integer hardStops) {
    this.hardStops = hardStops;
    return this;
  }

  /**
   * User's total number of hard stops
   * @return hardStops
  **/
  @ApiModelProperty(value = "User's total number of hard stops")


  public Integer getHardStops() {
    return hardStops;
  }

  public void setHardStops(Integer hardStops) {
    this.hardStops = hardStops;
  }

  public Profile hardAccelerations(Integer hardAccelerations) {
    this.hardAccelerations = hardAccelerations;
    return this;
  }

  /**
   * User's total number of hard accelerations
   * @return hardAccelerations
  **/
  @ApiModelProperty(value = "User's total number of hard accelerations")


  public Integer getHardAccelerations() {
    return hardAccelerations;
  }

  public void setHardAccelerations(Integer hardAccelerations) {
    this.hardAccelerations = hardAccelerations;
  }

  public Profile fuelConsumption(Float fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
    return this;
  }

  /**
   * User's amount of fuel consumed
   * @return fuelConsumption
  **/
  @ApiModelProperty(value = "User's amount of fuel consumed")


  public Float getFuelConsumption() {
    return fuelConsumption;
  }

  public void setFuelConsumption(Float fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
  }

  public Profile maxSpeed(Float maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }

  /**
   * User's maximum speed
   * @return maxSpeed
  **/
  @ApiModelProperty(value = "User's maximum speed")


  public Float getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(Float maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public Profile createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public Profile updatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Profile deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Whether the user has been deleted or not.
   * @return deleted
  **/
  @ApiModelProperty(value = "Whether the user has been deleted or not.")


  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.id, profile.id) &&
        Objects.equals(this.firstName, profile.firstName) &&
        Objects.equals(this.lastName, profile.lastName) &&
        Objects.equals(this.userId, profile.userId) &&
        Objects.equals(this.profilePictureUri, profile.profilePictureUri) &&
        Objects.equals(this.rating, profile.rating) &&
        Objects.equals(this.ranking, profile.ranking) &&
        Objects.equals(this.totalDistance, profile.totalDistance) &&
        Objects.equals(this.totalTrips, profile.totalTrips) &&
        Objects.equals(this.totalTime, profile.totalTime) &&
        Objects.equals(this.hardStops, profile.hardStops) &&
        Objects.equals(this.hardAccelerations, profile.hardAccelerations) &&
        Objects.equals(this.fuelConsumption, profile.fuelConsumption) &&
        Objects.equals(this.maxSpeed, profile.maxSpeed) &&
        Objects.equals(this.createdAt, profile.createdAt) &&
        Objects.equals(this.updatedAt, profile.updatedAt) &&
        Objects.equals(this.deleted, profile.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, userId, profilePictureUri, rating, ranking, totalDistance, totalTrips, totalTime, hardStops, hardAccelerations, fuelConsumption, maxSpeed, createdAt, updatedAt, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    profilePictureUri: ").append(toIndentedString(profilePictureUri)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    totalDistance: ").append(toIndentedString(totalDistance)).append("\n");
    sb.append("    totalTrips: ").append(toIndentedString(totalTrips)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    hardStops: ").append(toIndentedString(hardStops)).append("\n");
    sb.append("    hardAccelerations: ").append(toIndentedString(hardAccelerations)).append("\n");
    sb.append("    fuelConsumption: ").append(toIndentedString(fuelConsumption)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

