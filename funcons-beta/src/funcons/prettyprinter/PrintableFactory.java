package funcons.prettyprinter;

import funcons.carriers.IPrint;

public class PrintableFactory implements
  PrintableAbruptingFactory,
  PrintableBooleansFactory,
  PrintableBitsFactory,
  PrintableBreakingFactory,
  PrintableBindingFactory,
  PrintableCharactersFactory,
  PrintableClassesFactory,
  PrintableComputationTypesFactory,
  PrintableContinuingFactory,
  PrintableControllingFactory,
  PrintableDatatypesFactory,
  PrintableFailingFactory,
  PrintableFloatsFactory,
  PrintableFlowingFactory,
  PrintableFunctionsFactory,
  PrintableGeneratingFactory,
  PrintableGenericFactory,
  PrintableGivingFactory,
  PrintableGraphsFactory,
  PrintableIntegersFactory,
  PrintableInteractingFactory,
  PrintableLinkingFactory,
  PrintableListsFactory,
  PrintableMapsFactory,
  PrintableMultisetsFactory,
  PrintableNullFactory,
  PrintableObjectsFactory,
  PrintablePatternsFactory,
  PrintableRecordsFactory,
  PrintableReferencesFactory,
  PrintableReturningFactory,
  PrintableSequencesFactory,
  PrintableSetsFactory,
  PrintableStoringFactory,
  PrintableStringsFactory,
  PrintableThrowingFactory,
  PrintableThunksFactory,
  PrintableTreesFactory,
  PrintableTuplesFactory,
  PrintableValueTypesFactory,
  PrintableVariantsFactory,
  PrintableVectorsFactory,
  PrintableStringLiteralFactory
  {
	
	public static void main(String[] args) {
		PrintableFactory f = new PrintableFactory();
	    System.out.println(f.scope_(f.map__(new IPrint[0]), f.true_()).toFCT());
	}
  }

