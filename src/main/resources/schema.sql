-- Schema for the nutrition database
CREATE TABLE food_item (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    calories DOUBLE NOT NULL,
    protein DOUBLE NOT NULL,
    carbs DOUBLE NOT NULL,
    fat DOUBLE NOT NULL
);

-- Schema for the diet database
CREATE TABLE user_consumption (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    food_item_id BIGINT NOT NULL,
    weight_in_grams BIGINT NOT NULL,
    consumption_date DATE NOT NULL,
    FOREIGN KEY (food_item_id) REFERENCES food_item(id)
);