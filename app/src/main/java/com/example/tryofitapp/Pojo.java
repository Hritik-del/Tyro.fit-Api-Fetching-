 package com.example.tryofitapp;

        import java.util.List;
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;


public class Pojo {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public class WorkoutPlan {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("reps")
        @Expose
        private String reps;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getReps() {
            return reps;
        }

        public void setReps(String reps) {
            this.reps = reps;
        }

    }
    public class Datum {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("category_id")
        @Expose
        private Integer categoryId;
        @SerializedName("trainer_id")
        @Expose
        private Integer trainerId;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("duration")
        @Expose
        private Integer duration;
        @SerializedName("min_calories")
        @Expose
        private Integer minCalories;
        @SerializedName("max_calories")
        @Expose
        private Integer maxCalories;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("difficulty_level")
        @Expose
        private Integer difficultyLevel;
        @SerializedName("createdAt")
        @Expose
        private Integer createdAt;
        @SerializedName("updatedAt")
        @Expose
        private Object updatedAt;
        @SerializedName("video")
        @Expose
        private String video;
        @SerializedName("video_uploadedAt")
        @Expose
        private Object videoUploadedAt;
        @SerializedName("equipments")
        @Expose
        private List<Object> equipments = null;
        @SerializedName("workout_plans")
        @Expose
        private List<WorkoutPlan> workoutPlans = null;
        @SerializedName("trainer_name")
        @Expose
        private String trainerName;
        @SerializedName("category_name")
        @Expose
        private String categoryName;
        @SerializedName("difficulty_level_name")
        @Expose
        private String difficultyLevelName;

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

        public Integer getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
        }

        public Integer getTrainerId() {
            return trainerId;
        }

        public void setTrainerId(Integer trainerId) {
            this.trainerId = trainerId;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        public Integer getMinCalories() {
            return minCalories;
        }

        public void setMinCalories(Integer minCalories) {
            this.minCalories = minCalories;
        }

        public Integer getMaxCalories() {
            return maxCalories;
        }

        public void setMaxCalories(Integer maxCalories) {
            this.maxCalories = maxCalories;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getDifficultyLevel() {
            return difficultyLevel;
        }

        public void setDifficultyLevel(Integer difficultyLevel) {
            this.difficultyLevel = difficultyLevel;
        }

        public Integer getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(Integer createdAt) {
            this.createdAt = createdAt;
        }

        public Object getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(Object updatedAt) {
            this.updatedAt = updatedAt;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public Object getVideoUploadedAt() {
            return videoUploadedAt;
        }

        public void setVideoUploadedAt(Object videoUploadedAt) {
            this.videoUploadedAt = videoUploadedAt;
        }

        public List<Object> getEquipments() {
            return equipments;
        }

        public void setEquipments(List<Object> equipments) {
            this.equipments = equipments;
        }

        public List<WorkoutPlan> getWorkoutPlans() {
            return workoutPlans;
        }

        public void setWorkoutPlans(List<WorkoutPlan> workoutPlans) {
            this.workoutPlans = workoutPlans;
        }

        public String getTrainerName() {
            return trainerName;
        }

        public void setTrainerName(String trainerName) {
            this.trainerName = trainerName;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public String getDifficultyLevelName() {
            return difficultyLevelName;
        }

        public void setDifficultyLevelName(String difficultyLevelName) {
            this.difficultyLevelName = difficultyLevelName;
        }

    }
}




/*

         package com.example.tryofitapp;

 import com.google.gson.annotations.Expose;
 import com.google.gson.annotations.SerializedName;

 import java.util.List;
 public class Pojo {

     @SerializedName("page")
     @Expose
     private Integer page;
     @SerializedName("per_page")
     @Expose
     private Integer perPage;
     @SerializedName("total")
     @Expose
     private Integer total;
     @SerializedName("total_pages")
     @Expose
     private Integer totalPages;
     @SerializedName("data")
     @Expose
     private List<Datum> data = null;
     @SerializedName("support")
     @Expose
     private Support support;

     public Integer getPage() {
         return page;
     }

     public void setPage(Integer page) {
         this.page = page;
     }

     public Integer getPerPage() {
         return perPage;
     }

     public void setPerPage(Integer perPage) {
         this.perPage = perPage;
     }

     public Integer getTotal() {
         return total;
     }

     public void setTotal(Integer total) {
         this.total = total;
     }

     public Integer getTotalPages() {
         return totalPages;
     }

     public void setTotalPages(Integer totalPages) {
         this.totalPages = totalPages;
     }

     public List<Datum> getData() {
         return data;
     }

     public void setData(List<Datum> data) {
         this.data = data;
     }

     public Support getSupport() {
         return support;
     }

     public void setSupport(Support support) {
         this.support = support;
     }

     public class Datum {

         @SerializedName("id")
         @Expose
         private Integer id;
         @SerializedName("email")
         @Expose
         private String email;
         @SerializedName("first_name")
         @Expose
         private String firstName;
         @SerializedName("last_name")
         @Expose
         private String lastName;
         @SerializedName("avatar")
         @Expose
         private String avatar;

         public Integer getId() {
             return id;
         }

         public void setId(Integer id) {
             this.id = id;
         }

         public String getEmail() {
             return email;
         }

         public void setEmail(String email) {
             this.email = email;
         }

         public String getFirstName() {
             return firstName;
         }

         public void setFirstName(String firstName) {
             this.firstName = firstName;
         }

         public String getLastName() {
             return lastName;
         }

         public void setLastName(String lastName) {
             this.lastName = lastName;
         }

         public String getAvatar() {
             return avatar;
         }

         public void setAvatar(String avatar) {
             this.avatar = avatar;
         }

     }

     public class Support {

         @SerializedName("url")
         @Expose
         private String url;
         @SerializedName("text")
         @Expose
         private String text;

         public String getUrl() {
             return url;
         }

         public void setUrl(String url) {
             this.url = url;
         }

         public String getText() {
             return text;
         }

         public void setText(String text) {
             this.text = text;
         }

     }


 }*/






