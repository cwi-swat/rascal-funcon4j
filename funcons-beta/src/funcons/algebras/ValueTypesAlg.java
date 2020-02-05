// GeNeRaTeD fOr: ./Values/Value-Types/Value-Types.cbs
package funcons.algebras;

public interface ValueTypesAlg<E> {
  E is_in_type__(E[] args);
  E is__(E[] args);
  E is_value__(E[] args);
  E is_val__(E[] args);
  E when_true__(E[] args);
  E when__(E[] args);
  E cast_to_type__(E[] args);
  E cast__(E[] args);
  E is_equal__(E[] args);
  E is_eq__(E[] args);
  E values_();
  E vals_();
  E value_types_();
  E types_();
  E empty_type_();
  E ground_values_();
  E ground_vals_();
}