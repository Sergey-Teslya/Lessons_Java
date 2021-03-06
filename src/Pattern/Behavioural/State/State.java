package Pattern.Behavioural.State;

// Состояние - используеться когда есть некий объект,
// у него есть несколько состояний в которых он может находиться,
// и каждое из них описывается отдельным классом, в состояних может быть
// некая логика по переходу из одного состояния в другое
public interface State {
    void handel();
}
