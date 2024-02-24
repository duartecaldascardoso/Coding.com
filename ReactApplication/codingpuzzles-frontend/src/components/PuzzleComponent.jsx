import React, { useState } from 'react'

const PuzzleComponent = () => {

  const [question, setQuestion] = useState('');
  const [answer, setAnswer] = useState('');
  const [answerString, setAnswerString] = useState('');

  function savePuzzle(event) {
    event.preventDefault();

    const puzzle = {
      question,
      answer,
      answerString
    }
    console.log(puzzle);
  }
  return (
    <div className='container'>
      <br />
      <div className='row'>
        <div className='card col-md-6 offset-md-3'>
          <h2 className='text-center'>Create Puzzle</h2>
          <div className='card-body'>
            <form>
              <div className='form-group mb-2'>
                <label className='form-label'>Question</label>
                <input
                  type='text'
                  placeholder='Enter Puzzle Question'
                  name='question'
                  value={question}
                  className='form-control'
                  onChange={(event) => setQuestion(event.target.value)} />
              </div>

              <div className='form-group mb-2'>
                <label className='form-label'>Answer</label>
                <input
                  type='text'
                  placeholder='Enter Puzzle Answer'
                  name='answer'
                  value={answer}
                  className='form-control'
                  onChange={(event) =>setAnswer(event.target.value)} />
              </div>

              <div className='form-group mb-2'>
                <label className='form-label'>Answer String</label>
                <input
                  type='text'
                  placeholder='Enter Puzzle Answer String'
                  name='answerString'
                  value={answerString}
                  className='form-control'
                  onChange={(event) =>setAnswerString(event.target.value)} />
              </div>

              <button className='btn btn-success' onClick={savePuzzle}>Submit</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  )
}

export default PuzzleComponent