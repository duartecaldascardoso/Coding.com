import axios from "axios"

const REST_API_BASE_URL = 'http://localhost:8080/api/puzzles';

export const listPuzzles = () => axios.get(REST_API_BASE_URL);
export const createPuzzle = (puzzle) => axios.post(REST_API_BASE_URL, puzzle);
export const getPuzzleById = (puzzleId) => axios.get(REST_API_BASE_URL + '/' + puzzleId);
export const updatePuzzle = (puzzleId, puzzle) => axios.put(REST_API_BASE_URL + '/update/' + puzzleId, puzzle);