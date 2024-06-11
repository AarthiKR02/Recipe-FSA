package cooking.book.repository.recipe;

import cooking.book.model.recipe.Recipe;
import cooking.book.model.recipe.RecipeCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAllByRecipeCategory(RecipeCategory recipeCategory);
    List<Recipe> findAllByRecipeNameContainingIgnoreCase(String recipeName);
    List<Recipe> findAllByOrderByNoOfTimesAccessedDesc();
}
