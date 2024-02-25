import './App.css'
import FooterComponent from './components/FooterComponent'
import HeaderComponent from './components/HeaderComponent'
import ListPuzzlesComponent from './components/puzzleComponents/ListPuzzlesComponent'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import PuzzleComponent from './components/puzzleComponents/PuzzleComponent'

function App() {

  return (
    <BrowserRouter>
      <HeaderComponent />
      <Routes>
        <Route path='/' element={<ListPuzzlesComponent />} />
        <Route path='/puzzle/create' element={<PuzzleComponent />} />
        <Route path='/edit-puzzle/:id' element={<PuzzleComponent />} />
      </Routes>
      <FooterComponent />
    </BrowserRouter>

  )
}

export default App
